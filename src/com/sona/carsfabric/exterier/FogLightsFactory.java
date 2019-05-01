package com.sona.carsfabric.exterier;

public class FogLightsFactory implements CarExterier.ExterierFactory {
    public CarExterier exterierMake() {
        return new FogLights();
    }
}