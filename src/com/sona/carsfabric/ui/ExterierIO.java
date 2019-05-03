package com.sona.carsfabric.ui;

import com.sona.carsfabric.exterier.ExterierSelector;
import com.sona.carsfabric.exterier.ExterierType;

import java.util.Scanner;

public class ExterierIO {
    ExterierSelector exterierSelector;
    int price;

    public ExterierIO() {
        System.out.println("Insert exterior type: FogLights, Hatch");
        Scanner scanner = new Scanner(System.in);
        String exterierType = scanner.next();
        switch (exterierType) {
            case "FogLights":
                exterierSelector = new ExterierSelector(ExterierType.FOGLIGHTS);
                break;
            case "Hatch":
                exterierSelector = new ExterierSelector(ExterierType.HATCH);
                break;
            default:
                break;
        }
    }

    public int getPrice() {
        return exterierSelector.price;
    }
}
