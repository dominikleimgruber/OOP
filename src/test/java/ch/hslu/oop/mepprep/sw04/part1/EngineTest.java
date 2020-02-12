package ch.hslu.oop.mepprep.sw04.part1;

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

}