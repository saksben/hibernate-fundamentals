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

    @Column(name = "STREET", table = "ADDRESSES", columnDefinition = "varchar(25) not null")
    @Getter
    @Setter
    private String street;

    @Column(name = "NUMBER", table = "ADDRESSES", columnDefinition = "varchar(10) not null")
    @Getter
    @Setter
    private String number;

    @Column(name = "ZIP_CODE", table = "ADDRESSES", columnDefinition = "varchar(10) not null")
    @Getter
    @Setter
    private String zipCode;

    @Column(name = "CITY", table = "ADDRESSES", columnDefinition = "varchar(25) not null")
    @Getter
    @Setter
    private String city;

    public Passenger(int id, String name) {
        this.id = id;
        this.name = name;
    }

}
