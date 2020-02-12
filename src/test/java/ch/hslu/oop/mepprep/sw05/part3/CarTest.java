package ch.hslu.oop.mepprep.sw05.part3;


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

        assertEquals(true, new Car().isSwitchedOff());

    }
    @Test
    void testGetSwitchCounter(){
        CountingSwitchable car = new Car();
        for(int i = 0; i < 10; i++){
            car.switchOn();
            car.switchOff();
        }
        assertEquals(20, car.getSwitchCount());
    }

    @Test
    void testSetName(){
        Named car = new Car("name");
        car.setName("testname");
        assertEquals("testname", car.getName());
    }

}