package com.sona.carsfabric.engine;

public class PetrolEngineFactory implements Engine.EngineFactory {
    public Engine engineMake() {
        return new PetrolEngine();
    }
}