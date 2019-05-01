package com.sona.carsfabric.carstype;

public class SportCarFactory implements CarModel.CarModelFactory {
    public CarModel makeCarModel() {
        return new SportCar();
    }
}