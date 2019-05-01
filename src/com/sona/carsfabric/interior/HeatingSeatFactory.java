package com.sona.carsfabric.interior;

public class HeatingSeatFactory implements CarInterier.InterierFactory {
    public CarInterier interierMake() {
        return new HeatingSeat();
    }
}