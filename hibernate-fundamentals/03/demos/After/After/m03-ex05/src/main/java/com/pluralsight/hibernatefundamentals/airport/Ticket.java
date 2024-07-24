package com.pluralsight.hibernatefundamentals.airport;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
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
