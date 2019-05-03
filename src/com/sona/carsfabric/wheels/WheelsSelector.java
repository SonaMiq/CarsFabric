package com.sona.carsfabric.wheels;

import com.sona.carsfabric.Car;
import com.sona.carsfabric.exterier.CarExterier;

public class WheelsSelector {
    public int price;

    public WheelsSelector(WheelsType wheelsType) {
        Wheels.WheelsFactory wheelsFactory = null;
        switch (wheelsType) {
            case FRONT:
                wheelsFactory = new FrontWheelsFactory();
                break;
            case BACK:
                wheelsFactory = new BackWheelsFactory();
                break;
            case FOURBYFOUR:
                wheelsFactory = new FourByFourWheelsFactory();
                break;
            default:
                break;
        }
        Wheels wheels = wheelsFactory.wheelsMake();
        price=wheels.price;
        System.out.println(wheels.getModel() + " Price: " + price);
        Car.wheels=wheels;
        Car.price+=wheels.price;
    }
}
