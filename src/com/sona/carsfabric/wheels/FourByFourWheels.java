package com.sona.carsfabric.wheels;

public class FourByFourWheels extends Wheels {

    @Override
    public String getModel() {
        return "4x4 wheels";
    }

    public FourByFourWheels() {
        super(5000);
    }
}

