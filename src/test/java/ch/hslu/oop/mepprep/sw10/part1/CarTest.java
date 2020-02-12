package ch.hslu.oop.mepprep.sw10.part1;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CarTest {

    @Test
    void testSwitchOn() {
        Car car = new Car();
        car.switchOn();
        assertEquals(true, car.isSwitchedOn());
    }

    @Test
    void testSwitchOff() {
        Car car = new Car();
        car.switchOn();
        car.switchOff();
        assertEquals(true, car.isSwitchedOff());

    }



}