package com.pluralsight.hibernatefundamentals.airport;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "PASSENGERS")
@SecondaryTable(name = "ADDRESSES",
        pkJoinColumns = @PrimaryKeyJoinColumn(name = "PASSENGER_ID", referencedColumnName = "PASSENGER_ID"))
@NoArgsConstructor
public class Passenger {
    @Id
    @Column(name = "PASSENGER_ID")
    @Getter
    private int id;

    @Column(name = "PASSENGER_NAME", table = "PASSENGERS")
    @Getter
    @Setter
    private String name;

    @Column(name = "PASSENGER_ADDRESS", table = "ADDRESSES", columnDefinition = "varchar(25) not null")
    @Getter
    @Setter
    private String address;

    public Passenger(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }
}
