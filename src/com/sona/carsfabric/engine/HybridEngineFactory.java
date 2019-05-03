package com.sona.carsfabric.engine;

public class HybridEngineFactory implements Engine.EngineFactory {
    @Override
    public Engine engineMake() {
        return new HybridEngine();
    }
}