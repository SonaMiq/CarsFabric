package com.sona.carsfabric.exterier;

public class ExterierSelector {
    public int price;

    public ExterierSelector(ExterierType exterierType) {
        CarExterier.ExterierFactory exterierFactory = null;
        switch (exterierType) {
            case HATCH:
                exterierFactory = new HatchFactory();
                break;
            case FOGLIGHTS:
                exterierFactory = new FogLightsFactory();
                break;
            default:
                break;
        }
        CarExterier carExterier = exterierFactory.exterierMake();
        price = carExterier.getPrice();
        System.out.println(carExterier.getType() + " Price: " + price);
    }
}
