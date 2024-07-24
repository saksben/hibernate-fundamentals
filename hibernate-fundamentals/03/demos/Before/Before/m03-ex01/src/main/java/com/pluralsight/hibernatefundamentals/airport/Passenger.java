package com.pluralsight.hibernatefundamentals.airport;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
public class Passenger {
    @Getter
    private int id;

    @Getter
    @Setter
    private String name;

    @Getter
    @Setter
    private String address;

    public Passenger(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

}
