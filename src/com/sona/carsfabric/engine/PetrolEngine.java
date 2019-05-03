package com.sona.carsfabric.engine;

public class PetrolEngine extends Engine {

    @Override
    public String getModel() {
        return "Petrol Engine";
    }

    PetrolEngine() {
        super(7000);
    }
}