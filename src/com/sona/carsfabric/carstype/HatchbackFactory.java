package com.sona.carsfabric.carstype;

public class HatchbackFactory implements CarModel.CarModelFactory {
    @Override
    public CarModel makeCarModel() {
        return new Hatchback();
    }
}