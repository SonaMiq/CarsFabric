package com.sona.carsfabric.ui;

import com.sona.carsfabric.interior.InterieSelector;
import com.sona.carsfabric.interior.InterierType;

import java.util.Scanner;

public class InterierIO {
    InterieSelector interieSelector;
    int price;

    public InterierIO() {
        System.out.println("Insert interior type: HeatingSeat, LeatherSalon");
        Scanner scanner = new Scanner(System.in);
        String interierType = scanner.next();
        switch (interierType) {
            case "HeatingSeat":
                interieSelector = new InterieSelector(InterierType.HEATINGSEAT);
                break;
            case "LeatherSalon":
                interieSelector = new InterieSelector(InterierType.LEATHERSALON);
                break;
            default:
                break;
        }
    }

    public int getPrice() {
        return interieSelector.price;
    }
}
