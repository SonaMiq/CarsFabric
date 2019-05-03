package com.sona.carsfabric.engine;

public class HybridEngine extends Engine {

    @Override
    public String getModel() {
        return "Hybrid Engine";
    }

    HybridEngine() {
        super(8000);
    }
}

