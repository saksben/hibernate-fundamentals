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
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter
    private int id;

    @Getter
    @Setter
    private String series;

    @Getter
    @Setter
    private String number;

    @Getter
    @Setter
    private String origin;

    @Getter
    @Setter
    private String destination;
}
