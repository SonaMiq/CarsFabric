package com.sona.carsfabric.carstype;

public abstract class CarModel {
    int price;

    public abstract String getModel();

    public CarModel(int price){
        this.price = price;
    }

    public interface CarModelFactory {
        public CarModel makeCarModel();
    }
}