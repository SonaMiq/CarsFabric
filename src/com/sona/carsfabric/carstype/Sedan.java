package com.sona.carsfabric.carstype;


public class Sedan extends CarModel {
    public int getPrice() {
        return 20000;
    }

    public String getModel() {
        return "Car Model Sedan";
    }
}

class SportCar extends Sedan {
    public int getPrice() {
        return 22000;
    }

    public String getModel() {
        return "Car Model Sedan SportCar";
    }
}

class Business extends Sedan {
    public int getPrice() {
        return 25000;
    }

    public String getModel() {
        return "Car Model Sedan Business";
    }
}

class Electric extends Sedan {
    public int getPrice() {
        return 30000;
    }

    public String getModel() {
        return "Car Model Sedan Electric";
    }
}