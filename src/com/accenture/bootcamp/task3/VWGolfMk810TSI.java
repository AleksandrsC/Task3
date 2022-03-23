package com.accenture.bootcamp.task3;

public class VWGolfMk810TSI extends Car {

    public VWGolfMk810TSI(){
        super();
        model="VW Golf Mk8";
        engine="1.0 TSI";
        fuel=Car.Fuel.PETROL;
    }
    @Override
    public int getMaxGear() {
        return 6;
    }
}
