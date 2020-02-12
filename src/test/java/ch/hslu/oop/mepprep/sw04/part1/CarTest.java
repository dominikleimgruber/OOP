package ch.hslu.oop.mepprep.sw04.part1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @Test
    void testSwitchOn() {
        Car car = new Car();
        car.switchOn();
        assertEquals(true, car.isSwitchedOn());
    }

    @Test
    void testSwitchOff() {

        assertEquals(true, new Car().isSwitchedOff());

    }


}