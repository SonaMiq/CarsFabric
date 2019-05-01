package com.sona.carsfabric.wheels;

public abstract class Wheels {

    public interface WheelsFactory {
        Wheels wheelsMake();
    }

    public abstract String getModel();
    public abstract int getPrice();
}






