package ch.hslu.oop.mepprep.sw03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DemoTest {


    @Test
    void testMaxOverflow() {
        assertEquals(123, new Demo().max(123,12,(Integer.MAX_VALUE + 1)));
    }
    @Test
    void testMaxNormal() {
        assertEquals(10000, new Demo().max(10000,12, 1));

    }

    @Test
    void testMaxAllSame() {
        assertEquals(10000, new Demo().max(10000,10000, 10000));
    }

    @Test
    void testMinus() {
        assertEquals(-123, new Demo().max(-123,-190,-(Integer.MAX_VALUE + 1)));
    }
}