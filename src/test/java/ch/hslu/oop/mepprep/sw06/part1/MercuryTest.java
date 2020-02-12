package ch.hslu.oop.mepprep.sw06.part1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MercuryTest {

    @Test
    void testCheckAggregateLiquid() {
        Mercury hg = new Mercury();
        assertEquals("liquid", hg.checkAggregate());

    }

    @Test
    void testCheckAggregateGas() {
        Mercury hg = new Mercury(new Temperatur(700.0f));
        assertEquals("gas", hg.checkAggregate());

    }

    @Test
    void testCheckAggregateSolid() {
        Mercury hg = new Mercury(new Temperatur(100.0f));
        assertEquals("solid", hg.checkAggregate());

    }


    @Test
    void testTestToString() {
        assertEquals("Element{Mercury, caution: poisoning}", new Mercury().toString());
    }
}