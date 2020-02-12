package ch.hslu.oop.mepprep.sw05.part2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NitrogenTest {


    @Test
    void testCheckAggregateLiquid() {

        assertEquals("liquid", new Nitrogen(new Temperatur(70.0f)).checkAggregate());
    }

    @Test
    void testCheckAggregateGas() {
        assertEquals("gas", new Nitrogen(new Temperatur(172.12f)).checkAggregate());
    }

    @Test
    void testCheckAggregateSolid() {
        assertEquals("solid", new Nitrogen(new Temperatur(50.0f)).checkAggregate());
    }
}