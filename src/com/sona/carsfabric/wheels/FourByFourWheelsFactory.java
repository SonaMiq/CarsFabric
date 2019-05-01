package com.sona.carsfabric.wheels;

public class FourByFourWheelsFactory implements Wheels.WheelsFactory {
    public Wheels wheelsMake(){
        return new FourByFourWheels();
    }
}