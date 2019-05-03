package com.sona.carsfabric.engine;

public class DieselEngine extends Engine {

    @Override
    public String getModel() {
        return "Diesel Engine";
    }

    DieselEngine(){
        super(5000);
    }
}
