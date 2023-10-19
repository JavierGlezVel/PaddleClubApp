package org.ulpgc.is1.model;

public class Member extends Customer {
    public Address address;
    public int points;

    public Member(Address address, int points, String name, String surname, NIF nif) {
        super(name, surname, nif);
        this.points = points;
        this.address = address;
    }
}
