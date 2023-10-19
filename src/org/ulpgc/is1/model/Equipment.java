package org.ulpgc.is1.model;

public class Equipment extends Extra {
    public String name;

    public Equipment(String name) {
        this.name = name;
    }

    public String getName() {
        //getter
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}