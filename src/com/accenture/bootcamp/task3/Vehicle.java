package com.accenture.bootcamp.task3;

public class Vehicle {
    private double speed;//m/s
    private int direction;//degrees, 0=North

    public Vehicle(){
        speed=0;
        direction=0;
    }

    /**
     *
     * @param speed Speed in m/s
     * @param direction absolute direction in degrees 0=North, 90=East, etc.
     */
    public Vehicle(double speed, int direction){
        this.speed=speed;
        this.direction=direction;
    }

    public int getDirection(){
        return direction;
    }
    /**
     * steers the vehicle;
     * @param delta Change of direction in degrees, positive values turn clockwise, negative anticlockwise.  Turns more than 360 degrees allowed.
     */
    public void steer(int delta){
        direction=(direction+delta)%360;
    }

    /**
     *
     * @return speed in m/s
     */
    public double getSpeed() {
        return speed;
    }

    /**
     * 
     * @param speed new speed in m/s
     */
    public void setSpeed(double speed) {
        this.speed = speed;
    }
}
