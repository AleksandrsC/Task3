package com.accenture.bootcamp.task3;

import static com.accenture.bootcamp.task3.Car.Fuel.*;

public abstract class Car extends Vehicle {


    public enum Fuel{
        PETROL,DIESEL,NATURAL_GAS,ELECTRIC,EXOTIC
    }
    public static final int NEUTRAL_GEAR=0;
    public static final int REVERSE_GEAR=-1;
    private int currentGear=NEUTRAL_GEAR;
    private String model="Generic car";
    private String engine="Generic engine";
    private Car.Fuel fuel=PETROL;



    /**
     * todo cars with multiple reverse gears
     * @return maximum gear this car has, not counting the neutral and reverse. 1 for continuous automatic transmissions.
     */
    public abstract int getMaxGear();

    public int getCurrentGear() {
        return currentGear;
    }
    public void shiftUp(){
        if(currentGear<getMaxGear())
            currentGear++;
    }
    public void shiftDown(){
        if(currentGear>NEUTRAL_GEAR)
            currentGear--;
    }

    public void neutral(){
        currentGear=NEUTRAL_GEAR;
    }
    public void reverse(){
        currentGear=REVERSE_GEAR;
    }
    public String getModel() {
        return model;
    }

    public String getEngine() {
        return engine;
    }

    public Fuel getFuel() {
        return fuel;
    }

}
