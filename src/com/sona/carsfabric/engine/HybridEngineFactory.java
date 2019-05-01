package com.sona.carsfabric.engine;

public class HybridEngineFactory implements Engine.EngineFactory {
    public Engine engineMake() {
        return new HybridEngine();
    }
}