package com.sona.carsfabric.interior;

public class LeatherSalonFactory implements CarInterier.InterierFactory {
    @Override
    public CarInterier interierMake() {
        return new LeatherSalon();
    }
}
