package com.pluralsight.hibernatefundamentals.airport;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "TICKETS")
@IdClass(TicketKey.class)
public class Ticket {
    @Id
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
