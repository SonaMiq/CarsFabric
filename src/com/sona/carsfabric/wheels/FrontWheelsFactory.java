package com.sona.carsfabric.wheels;

public class FrontWheelsFactory implements Wheels.WheelsFactory {
    public Wheels wheelsMake() {
        return new FrontWheels();
    }
}
