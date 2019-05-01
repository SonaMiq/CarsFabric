package com.sona.carsfabric.engine;

public abstract class Engine {

    public interface EngineFactory {
        Engine engineMake();
    }

    public abstract String getModel();

    public abstract int getPrice();
}

