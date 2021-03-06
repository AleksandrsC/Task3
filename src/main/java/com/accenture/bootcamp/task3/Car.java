package com.accenture.bootcamp.task3;

import static com.accenture.bootcamp.task3.Car.Fuel.*;

public abstract class Car extends Vehicle {


    public enum Fuel{
        PETROL,DIESEL,NATURAL_GAS,ELECTRIC,EXOTIC
    }
    public static String fuelAsString(Fuel fuel){

        switch(fuel){
            case PETROL: return "Petrol";
            case DIESEL: return "Diesel";
            case NATURAL_GAS: return "Natural Gas";
            case ELECTRIC: return "Electric";
            case EXOTIC: return "Exotic fuel (hydrogen, nitromethane, etc.)";
        }
        return "Unknown fuel";

    }

    public static final int NEUTRAL_GEAR=0;
    public static final int REVERSE_GEAR=-1;
    private int currentGear=NEUTRAL_GEAR;
    protected String model="Generic car";
    protected String engine="Generic engine";
    protected Car.Fuel fuel=PETROL;

    public Car() {
    }

    @Override
    public String toString() {
        return "Car{" +
                "getMaxGear()=" + getMaxGear() +
                ", currentGear=" + currentGear +
                ", model='" + model + '\'' +
                ", engine='" + engine + '\'' +
                ", fuel=" + fuelAsString(fuel) +
                '}';
    }

    /**
     * @param speed     Speed in m/s
     * @param direction absolute direction in degrees 0=North, 90=East, etc.
     */
    public Car(double speed, int direction) {
        super(speed, direction);
    }
    /**
     * @param speed     Speed in m/s
     * @param direction absolute direction in degrees 0=North, 90=East, etc.
     * @param initGear  initial gear. Set to max gear if too big, to reverse if less than -1;
     */
    public Car(double speed, int direction,int initGear) {
        super(speed, direction);
        if(initGear>getMaxGear()){
            initGear=getMaxGear();
        }else if(initGear<REVERSE_GEAR){
            initGear=REVERSE_GEAR;
        }
        currentGear=initGear;
    }

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

    /**
     * also inverts the speed
     */
    public void reverse(){
        currentGear=REVERSE_GEAR;
        setSpeed(0-getSpeed());
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
