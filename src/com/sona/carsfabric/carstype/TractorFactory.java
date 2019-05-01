package com.sona.carsfabric.carstype;

public class TractorFactory implements CarModel.CarModelFactory{
    public CarModel makeCarModel() {
        return new Tractor();
    }
}