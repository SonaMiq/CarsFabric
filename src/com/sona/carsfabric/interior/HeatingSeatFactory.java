package com.sona.carsfabric.interior;

public class HeatingSeatFactory implements CarInterier.InterierFactory {
    @Override
    public CarInterier interierMake() {
        return new HeatingSeat();
    }
}