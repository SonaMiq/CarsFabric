package com.sona.carsfabric.interior;

public abstract class CarInterier {
    public abstract String getType();

    public abstract int getPrice();

    public interface InterierFactory {
        public CarInterier interierMake();
    }
}
