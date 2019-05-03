package com.sona.carsfabric.carstype;

public class CrossoverFactory implements CarModel.CarModelFactory {
    @Override
    public CarModel makeCarModel() {
        return new Crossover();
    }
}
