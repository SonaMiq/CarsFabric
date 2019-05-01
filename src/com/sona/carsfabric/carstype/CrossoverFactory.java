package com.sona.carsfabric.carstype;

public class CrossoverFactory implements CarModel.CarModelFactory {
    public CarModel makeCarModel() {
        return new Crossover();
    }
}
