package com.sona.carsfabric.carstype;

public class ElectricFactory implements CarModel.CarModelFactory {
    @Override
    public CarModel makeCarModel() {
        return new Electric();
    }
}
