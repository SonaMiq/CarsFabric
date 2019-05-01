package com.sona.carsfabric.carstype;

public class BusinessFactory implements CarModel.CarModelFactory {
    public CarModel makeCarModel() {
        return new Business();
    }
}