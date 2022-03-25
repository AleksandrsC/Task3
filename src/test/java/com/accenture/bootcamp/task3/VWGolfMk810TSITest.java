package com.accenture.bootcamp.task3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VWGolfMk810TSITest {
    private VWGolfMk810TSI testCar=new VWGolfMk810TSI();

    @Test
    void toStringTest(){
        assertEquals(testCar.toString(),"Car{getMaxGear()=6, currentGear=0, model='VW Golf Mk8', engine='1.0 TSI', fuel=Petrol}");
    }
    @Test
    void getMaxGear() {
        assertEquals(testCar.getMaxGear(), 6);
    }

    @Test
    void shiftUpBasic(){
        testCar.neutral();
        testCar.shiftUp();
        assertEquals(testCar.getCurrentGear(),1);
    }
    @Test
    void shiftDownBasic(){
        testCar.neutral();
        testCar.shiftUp();
        testCar.shiftDown();
        assertEquals(testCar.getCurrentGear(),Car.NEUTRAL_GEAR);
    }

    @Test
    void shiftUpOverflow(){
        testCar.neutral();
        //guaranteed to shift up more than there are gears
        for (int i=0;i<testCar.getMaxGear()+2;i++)
            testCar.shiftUp();
        assertEquals(testCar.getCurrentGear(),testCar.getMaxGear());
    }
    @Test
    void shiftDownOverflow(){
        testCar.neutral();
        testCar.shiftDown();
        testCar.shiftDown();
        testCar.shiftDown();
        assertEquals(testCar.getCurrentGear(),Car.NEUTRAL_GEAR);
    }

    @Test
    void steeringTest(){
        int original=testCar.getDirection();
        testCar.steer(360);
        assertEquals(original,testCar.getDirection(),"360 degree turn didn't return us to the same heading");
        testCar.steer(10);
        assertEquals(original+10,testCar.getDirection(),"basic steering didn't work");
    }

}