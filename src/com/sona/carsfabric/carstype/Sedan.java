package com.sona.carsfabric.carstype;


public class Sedan extends CarModel {

    Sedan(int price) {
        super(price);
    }

    @Override
    public String getModel() {
        return "Car Model Sedan";
    }
}

class SportCar extends Sedan {
    SportCar() {
        super(22000);
    }

    @Override
    public String getModel() {
        super.getModel();
        return "SportCar";
    }
}

class Business extends Sedan {
    Business() {
        super(25000);
    }

    @Override
    public String getModel() {
        super.getModel();
        return "Business";
    }
}

class Electric extends Sedan {
    Electric() {
        super(30000);
    }

    @Override
    public String getModel() {
        super.getModel();
        return "Electric";
    }
}