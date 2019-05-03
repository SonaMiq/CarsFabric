package com.sona.carsfabric.wheels;

public abstract class Wheels {
    int price;

    public interface WheelsFactory {
        Wheels wheelsMake();
    }

    public abstract String getModel();

    public Wheels(int price) {
        this.price = price;
    }
}






