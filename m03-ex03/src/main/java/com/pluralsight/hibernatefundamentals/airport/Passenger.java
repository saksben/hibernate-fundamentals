package com.pluralsight.hibernatefundamentals.airport;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "PASSENGERS")
@SecondaryTables(
        {
                @SecondaryTable(name = "ADDRESSES",
                        pkJoinColumns = @PrimaryKeyJoinColumn(name = "PASSENGER_ID", referencedColumnName = "PASSENGER_ID")),
                @SecondaryTable(name = "PHONES",
                        pkJoinColumns = @PrimaryKeyJoinColumn(name = "PASSENGER_ID", referencedColumnName = "PASSENGER_ID"))
        }
)

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

    @Column(name = "ZIP_CODE", table = "ADDRESSES", columnDefinition = "varchar(25) not null")
    @Getter
    @Setter
    private String zipCode;

    @Column(name = "CITY", table = "ADDRESSES", columnDefinition = "varchar(25) not null")
    @Getter
    @Setter
    private String city;

    @Column(name = "AREA_CODE", table = "PHONES", columnDefinition = "varchar(5) not null")
    @Getter
    @Setter
    private String areaCode;

    @Column(name = "PREFIX", table = "PHONES", columnDefinition = "varchar(5) not null")
    @Getter
    @Setter
    private String prefix;

    @Column(name = "LINE_NUMBER", table = "PHONES", columnDefinition = "varchar(10) not null")
    @Getter
    @Setter
    private String lineNumber;

    public Passenger(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
