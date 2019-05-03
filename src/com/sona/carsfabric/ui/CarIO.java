package com.sona.carsfabric.ui;

import com.sona.carsfabric.carstype.ModelSelector;
import com.sona.carsfabric.carstype.ModelType;
import com.sona.carsfabric.carstype.SedanType;

import java.util.Scanner;

public class CarIO {
    ModelSelector modelSelector;
    int price;

    public CarIO() {
        System.out.println("Insert car type: Crossover, Hatchback, Sedan, Tractor, Truck");
        Scanner scanner = new Scanner(System.in);
        String modelType = scanner.next();
        switch (modelType) {
            case "Crossover":
                modelSelector = new ModelSelector(ModelType.CROSSOVER,null);
                break;
            case "Hatchback":
                modelSelector = new ModelSelector(ModelType.HATCHBACK,null);
                break;
            case "Sedan":
                System.out.println("Insert Sedan type: Business, Electric, SportCar");
                scanner = new Scanner(System.in);
                String sedanType = scanner.next();
                switch (sedanType) {
                    case "Business": modelSelector = new ModelSelector(ModelType.SEDAN, SedanType.BUSINESS);
                    break;
                    case "Electric": modelSelector = new ModelSelector(ModelType.SEDAN, SedanType.ELECTRIC);
                    break;
                    case "SportCar": modelSelector = new ModelSelector(ModelType.SEDAN, SedanType.SPORTCAR);
                    break;
                }
                break;
            case "Tractor":
                modelSelector = new ModelSelector(ModelType.TRACTOR,null);
                break;
            case "Truck":
                modelSelector = new ModelSelector(ModelType.TRUCK,null);
                break;
            default:
                break;
        }
    }
}

