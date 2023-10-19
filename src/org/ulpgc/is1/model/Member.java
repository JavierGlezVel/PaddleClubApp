package org.ulpgc.is1.model;

import java.util.ArrayList;

public class Member extends Customer {
    public ArrayList<Address> address;
    public int point;

    public Member(String name, String surname, NIF nif) {
        super(name, surname, nif);
    }

    public void addAddress (String street, int number, int postalCode, String city) {
        Address a = new Address (street, number, postalCode, city);
        address.add(a);
    }
}
