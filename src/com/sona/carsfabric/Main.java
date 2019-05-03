package com.sona.carsfabric;

import com.sona.carsfabric.ui.*;

public class Main {
    public static void main(String[] args) {
        new CarIO();
        new EngineIO();
        new WheelsIO();
        new InterierIO();
        new ExterierIO();
        System.out.println("The new car model: " + Car.model.getModel());
        System.out.println("engine: " + Car.engine.getModel());
        System.out.println("wheels: " + Car.wheels.getModel());
        System.out.println("interior: " + Car.carInterier.getType());
        System.out.println("exterior: " + Car.carExterier.getType());
        System.out.println("Total price is: " + Car.price);
    }
}

