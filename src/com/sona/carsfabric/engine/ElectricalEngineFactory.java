package com.sona.carsfabric.engine;

public class ElectricalEngineFactory implements Engine.EngineFactory {
    @Override
    public Engine engineMake() {
        return new ElectricalEngine();
    }
}
