package org.ulpgc.is1.model;

public class Equipment extends Extra {
    private String name;

    public Equipment(String name, int price) {
        super(price);
        this.name = name;
    }


    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}