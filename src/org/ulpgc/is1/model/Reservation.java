package org.ulpgc.is1.model;

import java.util.ArrayList;
import java.util.Date;

public class Reservation {
    private static int NEXT_ID = 0;
    private final int id;
    public Date date;
    public Customer customer;
    public Court court;
    public ArrayList<Extra>extra;

    public Reservation(Court court, Customer customer, int id, int NEXT_ID, Date date) {
        this.id = id;
        this.NEXT_ID = NEXT_ID;
        this.date = date;
        this.customer = customer;
        this.court = court;
        this.extra = new ArrayList<Extra>();
    }

    public void addExtra(Extra extra) {
        this.extra.add(extra);
    }

    public static int getNextId() {
        return NEXT_ID;
    }

    public static void setNextId(int nextId) {
        NEXT_ID = nextId;
    }

    public int getId() {
        return id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
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

    public int price() {
        //????????
        return 0;
    }
}
