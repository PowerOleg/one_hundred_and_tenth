package com.spring.constructor;

public class MotoBike {
    private Engine engine;
    private Transmission transmission;
    private String name;

    public MotoBike(Engine engine, Transmission transmission, String name) {
        this.engine = engine;
        this.transmission = transmission;
        this.name = name;
    }

    @Override
    public String toString() {
        return "MotoBike{" +
                "engine=" + engine +
                ", transmition=" + transmission +
                ", name='" + name + '\'' +
                '}';
    }
}
