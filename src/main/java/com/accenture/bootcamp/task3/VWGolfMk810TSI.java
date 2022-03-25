package com.accenture.bootcamp.task3;

public class VWGolfMk810TSI extends Car {

    public VWGolfMk810TSI(){
        super();
        initData();
    }

    private void initData() {
        model="VW Golf Mk8";
        engine="1.0 TSI";
        fuel= Fuel.PETROL;
    }

    /**
     * @param speed     Speed in m/s
     * @param direction absolute direction in degrees 0=North, 90=East, etc.
     */
    public VWGolfMk810TSI(double speed, int direction) {
        super(speed, direction);
        initData();
    }

    /**
     * @param speed     Speed in m/s
     * @param direction absolute direction in degrees 0=North, 90=East, etc.
     * @param initGear  = initial gear.
     */
    public VWGolfMk810TSI(double speed, int direction, int initGear) {
        super(speed, direction, initGear);
        initData();
    }

    @Override
    public int getMaxGear() {
        return 6;
    }
}
