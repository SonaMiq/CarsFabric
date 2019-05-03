package com.sona.carsfabric.wheels;

public class BackWheelsFactory implements Wheels.WheelsFactory {
    @Override
    public Wheels wheelsMake() {
        return new BackWheels();
    }
}

