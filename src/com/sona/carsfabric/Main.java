package com.sona.carsfabric;

import com.sona.carsfabric.ui.*;

public class Main {
    public static void main(String[] args) {
        int price = 0;
        CarIO carIO = new CarIO();
        WheelsIO wheelsIO = new WheelsIO();
        EngineIO engineIO = new EngineIO();
        InterierIO interierIO = new InterierIO();
        ExterierIO exterierIO = new ExterierIO();
        carIO.carIO();
        price += carIO.getPrice();
        wheelsIO.whelsIO();
        price += wheelsIO.getPrice();
        engineIO.engineIO();
        price += engineIO.getPrice();
        interierIO.interierIO();
        price += interierIO.getPrice();
        exterierIO.exterierIO();
        price += exterierIO.getPrice();
        System.out.println("The total price is: " + price);
    }
}

