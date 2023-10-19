package org.ulpgc.is1.model;

public class Umpire extends Extra {
    public String name;
    public String surname;

    public Umpire(String name, String surname, int price) {
        super(price);
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String getName() {
        return name;
    }
    public String getSurname() { return surname; }

    public void setName(String name) {
        this.name = name;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }

}
