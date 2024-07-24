package com.pluralsight.hibernatefundamentals.airport;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "TICKETS")
public class Ticket {
    @EmbeddedId
    @Getter
    @Setter
    private TicketKey id;

    @Getter
    @Setter
    private String origin;

    @Getter
    @Setter
    private String destination;
}
