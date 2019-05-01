package com.sona.carsfabric.carstype;

public class ElectricFactory implements CarModel.CarModelFactory {
    public CarModel makeCarModel() {
        return new Electric();
    }
}
