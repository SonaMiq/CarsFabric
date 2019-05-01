package com.sona.carsfabric.carstype;

public abstract class CarModel {
    public abstract String getModel();

    public abstract int getPrice();

    public interface CarModelFactory {
        public CarModel makeCarModel();
    }
}