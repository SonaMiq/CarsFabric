package com.sona.carsfabric.engine;

public class ElectricalEngine extends Engine {

    @Override
    public String getModel() {
        return "Electrical Engine";
    }

    ElectricalEngine() {
        super(10000);
    }
}
