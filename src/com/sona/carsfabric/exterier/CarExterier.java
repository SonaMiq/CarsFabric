package com.sona.carsfabric.exterier;

public abstract class CarExterier {
    public abstract String getType();

    public abstract int getPrice();

    public interface ExterierFactory {
        public CarExterier exterierMake();
    }
}
