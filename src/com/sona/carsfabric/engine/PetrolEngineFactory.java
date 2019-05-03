package com.sona.carsfabric.engine;

public class PetrolEngineFactory implements Engine.EngineFactory {
    @Override
    public Engine engineMake() {
        return new PetrolEngine();
    }
}