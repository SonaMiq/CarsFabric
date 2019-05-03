package com.sona.carsfabric.wheels;

public class BackWheels extends Wheels {

    @Override
    public String getModel() {
        return "Back wheel";
    }

    public BackWheels(){
        super(2000);
    }
}

