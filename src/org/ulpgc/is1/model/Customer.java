package org.ulpgc.is1.model;
import java.util.ArrayList;

public class Customer {
    public ArrayList<Reservation>reservation;
    public NIF nif;
    public String name;
    public String surname;

    public Customer(String name, String surname, NIF nif){
        this.name = name;
        this.surname = surname;
        this.nif = nif;
        this.reservation = new ArrayList<Reservation>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public NIF getNif() {
        return nif;
    }

    public void setNif(NIF nif) {
        this.nif = nif;
    }

    public void addReservation (Reservation reservation) {
        this.reservation.add(reservation);
    }

    public ArrayList<Reservation> getReservation() {
        return reservation;
    }
}
