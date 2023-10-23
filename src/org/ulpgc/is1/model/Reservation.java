package org.ulpgc.is1.model;

import java.util.ArrayList;
import java.util.Date;

public class Reservation {
    private static int NEXT_ID = 0;
    private final int id;
    public Date date;
    public Customer customer;
    public Court court;
    public ArrayList<Extra>extras;

    public Reservation(Customer customer, Court court) {
        this.id = NEXT_ID++;
        this.date = new Date();
        this.customer = customer;
        this.court = court;
        this.extras = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public Date getDate() {
        return new Date(date.getTime());
    }
    public void setDate(Date date) {
        this.date = date;
    }
    public int price() {
        int total = 0;

        for (Extra extra: extras) {
            total += extra.getPrice();
        }

        total += court.getPrice();

        return total;
    }
    public void addExtra(Extra extra) {
        extras.add(extra);
    }
    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Court getCourt() {
        return court;
    }

    public void setCourt(Court court) {
        this.court = court;
    }
    @Override
    public String toString() {
        String result = "Reservation ID: " + id + "\n";
        result += "Reservation Date: " + date + "\n";
        result += "Customer Info:\n" + customer + "\n";
        result += "Court Info: (\n" + court + "\n)\n";

        if (this.extras.size() > 0){
            result += "Extras: (\n";

            for (Extra extra : extras) {
                result += "    " + extra + "\n";
            }

            result += ")\n";
        }

        result += "Total Price: " + price() + "€\n";

        return result;
    }

}
