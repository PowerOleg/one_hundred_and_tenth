package com.spring.constructor;


public class Engine {
    private String nameEngine = "BMW";

    public Engine(String nameEngine) {
        this.nameEngine = nameEngine;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "nameEngine='" + nameEngine + '\'' +
                '}';
    }
}
