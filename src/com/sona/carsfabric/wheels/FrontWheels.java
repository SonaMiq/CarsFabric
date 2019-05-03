package com.sona.carsfabric.wheels;

public class FrontWheels extends Wheels {

    @Override
    public String getModel() {
        return "Front wheel";
    }

    public FrontWheels() {
        super(3000);
    }
}
