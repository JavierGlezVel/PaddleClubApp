package org.ulpgc.is1.control;

import org.ulpgc.is1.model.Court;
import org.ulpgc.is1.model.Customer;
import org.ulpgc.is1.model.Reservation;
import java.util.ArrayList;

public class PaddleManager {

    private ArrayList<Court> courts;
    private ArrayList<Customer> customers;
    private ArrayList<Reservation> reservations;

    public PaddleManager() {

        courts = new ArrayList<>();
        customers = new ArrayList<>();
        reservations = new ArrayList<>();
    }


    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public void addCourt(Court court) {
        courts.add(court);
    }

    public void reserve(Reservation reservation) {
        this.reservations.add(reservation);
    }

    public Customer getCustomer(int i) {
        if ((i >= 0) && (i < customers.size())) {
            return customers.get(i);
        } else {
            return null;
        }
    }


    public Court getCourt(int i) {
        if ((i >= 0) && (i < courts.size())) {
            return courts.get(i);
        } else {
            return null;
        }
    }


    public int countCustomer() {
        return this.customers.size();
    }

    public ArrayList<Reservation> getReservations() {
        return new ArrayList<>(reservations);
    }

    public void remove(int index) {
        if (index >= 0 && index < customers.size()) {
            this.customers.remove(index);
        }
    }
}