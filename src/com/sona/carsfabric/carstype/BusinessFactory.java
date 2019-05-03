package com.sona.carsfabric.carstype;

public class BusinessFactory implements CarModel.CarModelFactory {

    @Override
    public CarModel makeCarModel() {
        return new Business();
    }
}