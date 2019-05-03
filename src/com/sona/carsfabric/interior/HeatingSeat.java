package com.sona.carsfabric.interior;


public class HeatingSeat extends CarInterier {

    public HeatingSeat() {
        super(2000);
    }

    @Override
    public String getType() {
        return "Heating Seat Interier";
    }
}