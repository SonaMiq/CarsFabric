package com.sona.carsfabric.wheels;

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
        price = wheels.getPrice();
        System.out.println(wheels.getModel() + " Price: " + price);
    }
}
