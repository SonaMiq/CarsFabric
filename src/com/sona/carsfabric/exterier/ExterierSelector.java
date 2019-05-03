package com.sona.carsfabric.exterier;

import com.sona.carsfabric.Car;

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
        price = carExterier.price;
        System.out.println(carExterier.getType() + " Price: " + price);
        Car.carExterier=carExterier;
        Car.price+=price;
    }
}
