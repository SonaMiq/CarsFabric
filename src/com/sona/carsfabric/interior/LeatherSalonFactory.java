package com.sona.carsfabric.interior;

public class LeatherSalonFactory implements CarInterier.InterierFactory {
    public CarInterier interierMake() {
        return new LeatherSalon();
    }
}
