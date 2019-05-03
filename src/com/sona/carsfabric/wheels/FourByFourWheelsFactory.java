package com.sona.carsfabric.wheels;

public class FourByFourWheelsFactory implements Wheels.WheelsFactory {
    @Override
    public Wheels wheelsMake() {
        return new FourByFourWheels();
    }
}