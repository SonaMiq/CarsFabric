package com.sona.carsfabric.interior;

public abstract class CarInterier {

    int price;

    public abstract String getType();

    public CarInterier(int price) {
        this.price = price;
    }

    public interface InterierFactory {
        public CarInterier interierMake();
    }
}
