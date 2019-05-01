package com.sona.carsfabric.carstype;

public class TruckFactory implements CarModel.CarModelFactory {
    public CarModel makeCarModel() {
        return new Truck();
    }
}
