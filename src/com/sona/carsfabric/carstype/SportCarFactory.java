package com.sona.carsfabric.carstype;

public class SportCarFactory implements CarModel.CarModelFactory {
    @Override
    public CarModel makeCarModel() {
        return new SportCar();
    }
}