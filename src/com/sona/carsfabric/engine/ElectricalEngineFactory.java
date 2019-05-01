package com.sona.carsfabric.engine;

public class ElectricalEngineFactory implements Engine.EngineFactory {
    public Engine engineMake() {
        return new ElectricalEngine();
    }
}
