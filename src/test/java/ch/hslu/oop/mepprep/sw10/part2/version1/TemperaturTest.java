package ch.hslu.oop.mepprep.sw10.part2.version1;



import nl.jqno.equalsverifier.EqualsVerifier;
import nl.jqno.equalsverifier.Warning;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class TemperaturTest {


    @Test
    void testIllegalKelvin() {
        final IllegalArgumentException e =
                assertThrows(IllegalArgumentException.class, () -> Temperatur.createFromKelvin(-200));
        assertEquals("Value below 0 Kelvin or not a number.", e.getMessage());
    }

    @Test
    void testIllegalCelsius() {
        final IllegalArgumentException e =
                assertThrows(IllegalArgumentException.class, () -> Temperatur.createFromCelsius(-273.16f));
        assertEquals("Value below 0 Kelvin or not a number.", e.getMessage());
    }


    @Test
    void testGetCelsius() {
        Temperatur temp = Temperatur.createFromKelvin(293.15f);
        assertEquals(20.0f, temp.getCelsius(), 0.01);
    }

    @Test
    void testGetFahrenheit() {
        Temperatur temp = Temperatur.createFromKelvin(293.15f);
        assertEquals(68.0f, temp.getFahrenheit(), 0.01);

    }

    @Test
    void testTestHashCode() {
        Temperatur temp = Temperatur.createFromKelvin(200);
        Temperatur temp2 = Temperatur.createFromKelvin(200);
        assertEquals(true, temp2.hashCode() == temp.hashCode());

    }

    @Test
    void testTestEqualsTrue() {
        assertEquals(true, Temperatur.createFromKelvin(20.0f).equals(Temperatur.createFromKelvin(20.0f)));
    }

    @Test
    void testTestEqualsFalse() {
        assertEquals(false, Temperatur.createFromKelvin(200.0f).equals(Temperatur.createFromKelvin(20.0f)));
    }

    @Test
    void testTestEqualsNull() {
        assertEquals(false, Temperatur.createFromKelvin(293.15f).equals(null));
    }

    @Test
    void testEqualsContract() {
        EqualsVerifier.forClass(Temperatur.class).suppress(Warning.NONFINAL_FIELDS).verify();
    }

    @Test
    void testCompareToBigger() {
        assertEquals(-1, Temperatur.createFromKelvin(200.0f).compareTo(Temperatur.createFromKelvin(300)));
    }

    @Test
    void testCompareToEqual() {
        assertEquals(0, Temperatur.createFromKelvin(200.0f).compareTo(Temperatur.createFromKelvin(200.0f)));
    }

    @Test
    void testCompareToLess() {
        assertEquals(1, Temperatur.createFromKelvin(300.0f).compareTo(Temperatur.createFromKelvin(200)));
    }

    @Test
    void testCompareToNull() {
        assertEquals(1, Temperatur.createFromKelvin(200.0f).compareTo(null));
    }

    @Test
    void testCelsiusToKelvin() {
        assertEquals(293.15f, Temperatur.celsiusToKelvin(20.0f), 0.01);
    }

    @Test
    void testKelvinToCelsius() {
        assertEquals(20.0f, Temperatur.kelvinToCelsius(293.15f), 0.01);
    }

    @Test
    void testToString() {
        assertEquals("Temperatur{Kelvin=293.15K}", Temperatur.createFromKelvin(293.15f).toString());
    }


}