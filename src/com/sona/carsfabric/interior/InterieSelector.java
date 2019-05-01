package com.sona.carsfabric.interior;

public class InterieSelector {
    public int price;

    public InterieSelector(InterierType interierType) {
        CarInterier.InterierFactory interierFactory = null;
        switch (interierType) {
            case HEATINGSEAT:
                interierFactory = new HeatingSeatFactory();
                break;
            case LEATHERSALON:
                interierFactory = new LeatherSalonFactory();
                break;
            default:
                break;
        }
        CarInterier carInterier = interierFactory.interierMake();
        price = carInterier.getPrice();
        System.out.println(carInterier.getType() + " Price: " + price);
    }
}
