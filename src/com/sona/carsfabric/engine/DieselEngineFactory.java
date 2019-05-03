package com.sona.carsfabric.engine;

public class DieselEngineFactory implements Engine.EngineFactory {

    @Override
    public Engine engineMake() {
        return new DieselEngine();
    }
}
