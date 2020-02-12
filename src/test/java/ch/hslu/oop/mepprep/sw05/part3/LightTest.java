package ch.hslu.oop.mepprep.sw05.part3;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LightTest {

    @Test
    void testSwitchOn() {
        Switchable light = new Light();
        light.switchOn();
        assertEquals(true, light.isSwitchedOn());
    }

    @Test
    void testSwitchOff() {
        assertEquals(true, new Light().isSwitchedOff());
    }

    @Test
    void testSetLumen() {
        Light light = new Light();
        light.setLumen(1400);
        assertEquals(1400, light.getLumen());

    }
}