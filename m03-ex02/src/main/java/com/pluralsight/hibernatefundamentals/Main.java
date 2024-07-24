package com.pluralsight.hibernatefundamentals;

import com.pluralsight.hibernatefundamentals.airport.Passenger;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hibernatefundamentals.m03.ex02");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        Passenger john = new Passenger(1, "John Smith");
        john.setStreet("Flowers Street");
        john.setNumber("3");
        john.setZipCode("123456");
        john.setCity("Boston");
        em.persist(john);

        em.getTransaction().commit();
        emf.close();
    }
}