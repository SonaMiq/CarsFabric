package com.sona.carsfabric.exterier;

public class FogLightsFactory implements CarExterier.ExterierFactory {
    @Override
    public CarExterier exterierMake() {
        return new FogLights();
    }
}