package com.sona.carsfabric.carstype;

import com.sona.carsfabric.Car;

public class ModelSelector {
    public int price;

    public ModelSelector(ModelType modelType, SedanType sedanType) {
        CarModel.CarModelFactory carModelFactory = null;
        switch (modelType) {
            case HATCHBACK:
                carModelFactory = new HatchbackFactory();
                break;
            case CROSSOVER:
                carModelFactory = new CrossoverFactory();
                break;
            case TRACTOR:
                carModelFactory = new TractorFactory();
                break;
            case TRUCK:
                carModelFactory = new TruckFactory();
                break;
            case SEDAN: {
                switch (sedanType) {
                    case SPORTCAR:
                        carModelFactory = new SportCarFactory();
                        break;
                    case ELECTRIC:
                        carModelFactory = new ElectricFactory();
                        break;
                    case BUSINESS:
                        carModelFactory = new BusinessFactory();
                        break;
                    default:
                        break;
                }
                break;
            }
            default:
                break;
        }
        CarModel carModel = carModelFactory.makeCarModel();
        this.price=carModel.price;
        System.out.println(carModel.getModel() + " Price: " + price);
        Car.model=carModel;
        Car.price+=price;
    }
}
