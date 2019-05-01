package com.sona.carsfabric.carstype;

public class HatchbackFactory implements CarModel.CarModelFactory {
    public CarModel makeCarModel() {
        return new Hatchback();
    }
}