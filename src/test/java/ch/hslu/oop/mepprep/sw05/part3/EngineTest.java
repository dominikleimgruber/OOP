package ch.hslu.oop.mepprep.sw05.part3;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EngineTest {

    @Test
    void testSwitchOn() {
        Engine engine = new Engine();
        engine.switchOn();
        assertEquals(true, engine.isSwitchedOn());
    }

    @Test
    void testSwitchOff() {
        Engine engine = new Engine(2000);
        engine.switchOff();
        assertEquals(true, engine.isSwitchedOff());
    }


    @Test
    void testSetRpmNormal() {

        Engine engine = new Engine();
        engine.setRpm(2000);
        assertEquals(2000, engine.getRpm());
    }


    @Test
    void testSetRpmMinus() {
        Engine engine = new Engine();
        engine.setRpm(-2000);
        assertEquals(0, engine.getRpm());

    }

    @Test
    void testSetRpmToHigh() {
        Engine engine = new Engine();
        engine.setRpm(20000);
        assertEquals(9000, engine.getRpm());
    }

    @Test
    void testGetSwitchCounter(){
        CountingSwitchable engine = new Engine();
        for(int i = 0; i < 10; i++){
            engine.switchOn();
            engine.switchOff();
        }
        assertEquals(20, engine.getSwitchCount());
    }

}