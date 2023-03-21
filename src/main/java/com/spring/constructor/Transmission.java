package com.spring.constructor;

public class Transmission {
    private String nameTransmission;

    public Transmission(String nameTransmission) {
        this.nameTransmission = nameTransmission;
    }

    @Override
    public String toString() {
        return "Transmission{" +
                "nameTransmission='" + nameTransmission + '\'' +
                '}';
    }
}
