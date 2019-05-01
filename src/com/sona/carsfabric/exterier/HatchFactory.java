package com.sona.carsfabric.exterier;

public class HatchFactory implements CarExterier.ExterierFactory {
    public CarExterier exterierMake() {
        return new Hatch();
    }
}
