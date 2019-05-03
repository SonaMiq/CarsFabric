package com.sona.carsfabric.engine;

public abstract class Engine {

    int price;

    public interface EngineFactory {
        Engine engineMake();
    }

    public abstract String getModel();

    public Engine(int price) {
        this.price = price;
    }
}

