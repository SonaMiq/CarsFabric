package com.sona.carsfabric.carstype;

public class TractorFactory implements CarModel.CarModelFactory{
    @Override
    public CarModel makeCarModel() {
        return new Tractor();
    }
}