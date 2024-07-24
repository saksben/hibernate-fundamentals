package com.pluralsight.hibernatefundamentals.airport;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "TICKETS")
@NoArgsConstructor
public class Ticket {

    @Id
    @Column(name = "ID")
    private int id;

    @Column(name = "NUMBER")
    @Getter
    @Setter
    private String number;

    @ManyToOne
    @JoinColumn(name = "PASSENGER_ID")
    @Getter
    @Setter
    private Passenger passenger;

    public Ticket(int id, String number) {
        this.id = id;
        this.number = number;
    }
}
