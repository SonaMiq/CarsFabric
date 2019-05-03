package com.sona.carsfabric.wheels;

public class FrontWheelsFactory implements Wheels.WheelsFactory {
    @Override
    public Wheels wheelsMake() {
        return new FrontWheels();
    }
}
