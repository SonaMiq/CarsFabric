package com.sona.carsfabric.ui;

import com.sona.carsfabric.wheels.WheelsSelector;
import com.sona.carsfabric.wheels.WheelsType;

import java.util.Scanner;

public class WheelsIO {
    WheelsSelector wheelsSelector;
    int price;
    public void whelsIO(){
        System.out.println("Insert wheels type: Back, Front, 4x4");
        Scanner scanner = new Scanner(System.in);
        String wheelsType = scanner.next();
        switch (wheelsType) {
            case "Back":
                wheelsSelector=  new WheelsSelector(WheelsType.BACK);
                break;
            case "Front":
                wheelsSelector=  new WheelsSelector(WheelsType.FRONT);
                break;
            case "4x4":
                wheelsSelector=   new WheelsSelector(WheelsType.FOURBYFOUR);
                break;
            default:
                break;
        }
    }
    public int getPrice(){
        return wheelsSelector.price;
    }
}
