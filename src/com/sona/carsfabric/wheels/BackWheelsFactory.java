package com.sona.carsfabric.wheels;

public class BackWheelsFactory implements Wheels.WheelsFactory {
    public Wheels wheelsMake() {
        return new BackWheels();
    }
}

