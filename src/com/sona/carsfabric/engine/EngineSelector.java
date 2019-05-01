package com.sona.carsfabric.engine;

public class EngineSelector {
    public int price;

    public EngineSelector(EngineType engineType) {

        Engine.EngineFactory engineFactory = null;
        switch (engineType) {
            case ELECTRICAL:
                engineFactory = new ElectricalEngineFactory();
                break;
            case PETROL:
                engineFactory = new PetrolEngineFactory();
                break;
            case HYBRID:
                engineFactory = new HybridEngineFactory();
                break;
            case DIESEL:
                engineFactory = new DieselEngineFactory();
                break;
            default:
                break;
        }
        Engine engine=engineFactory.engineMake();
        price = engine.getPrice();
        System.out.println(engine.getModel() + " Price: " + price);
    }
}
