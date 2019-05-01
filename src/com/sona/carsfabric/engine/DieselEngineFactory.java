package com.sona.carsfabric.engine;

public class DieselEngineFactory implements Engine.EngineFactory {

    public Engine engineMake() {
        return new DieselEngine();
    }
}
