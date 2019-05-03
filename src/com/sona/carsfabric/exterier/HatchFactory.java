package com.sona.carsfabric.exterier;

public class HatchFactory implements CarExterier.ExterierFactory {
    @Override
    public CarExterier exterierMake() {
        return new Hatch();
    }
}
