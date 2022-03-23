package com.accenture.bootcamp.task3;

public class Car extends Vehicle {
    public static final int NEUTRAL_GEAR=0;
    public static final int REVERSE_GEAR=-1;
    private final int maxGear=5;
    private int currentGear=NEUTRAL_GEAR;


    public int getMaxGear() {
        return maxGear;
    }

    public int getCurrentGear() {
        return currentGear;
    }
    public void shiftUp(){
        if(currentGear<maxGear)
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

}
