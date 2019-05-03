package com.sona.carsfabric.exterier;

public abstract class CarExterier {

    int price;

    public abstract String getType();

    public CarExterier(int price) {
        this.price = price;
    }

    public interface ExterierFactory {
        public CarExterier exterierMake();
    }
}
