package com.sona.carsfabric.ui;

import com.sona.carsfabric.engine.EngineSelector;
import com.sona.carsfabric.engine.EngineType;

import java.util.Scanner;

public class EngineIO {
    EngineSelector engineSelector;
    int price;

    public  EngineIO() {
        System.out.println("Insert engine type: Diesel, Electrical, Hybrid, Petrol");
        Scanner scanner = new Scanner(System.in);
        String engineType = scanner.next();
        switch (engineType) {
            case "Diesel":
                engineSelector = new EngineSelector(EngineType.DIESEL);
                break;
            case "Electrical":
                engineSelector = new EngineSelector(EngineType.ELECTRICAL);
                break;
            case "Hybrid":
                engineSelector = new EngineSelector(EngineType.HYBRID);
                break;
            case "Petrol":
                engineSelector = new EngineSelector(EngineType.PETROL);
                break;
            default:
                break;
        }
    }

    public int getPrice() {
        return engineSelector.price;
    }
}
