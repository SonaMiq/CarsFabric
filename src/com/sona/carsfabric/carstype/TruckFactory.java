package com.sona.carsfabric.carstype;

public class TruckFactory implements CarModel.CarModelFactory {
    @Override
    public CarModel makeCarModel() {
        return new Truck();
    }
}
