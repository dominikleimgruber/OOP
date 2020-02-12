package ch.hslu.oop.mepprep.sw08;


import nl.jqno.equalsverifier.EqualsVerifier;
import nl.jqno.equalsverifier.Warning;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TemperaturTest {

    @Test
    void testSetKelvin() {
        Temperatur temp = new Temperatur();
        temp.setKelvin(200.0f);
        assertEquals(200.0f, temp.getKelvin());
    }

    @Test
    void testSetKelvinBelowZero() {

        Temperatur temp = new Temperatur();
        temp.setKelvin(-200.0f);
        assertEquals(293.15f, temp.getKelvin());
    }

    @Test
    void testGetCelsius() {
        Temperatur temp = new Temperatur();
        assertEquals(20.0f, temp.getCelsius(), 0.01);
    }

    @Test
    void testGetFahrenheit() {
        Temperatur temp = new Temperatur();
        assertEquals(68.0f, temp.getFahrenheit(), 0.01);

    }

    @Test
    void testTestHashCode() {
        Temperatur temp = new Temperatur(200);
        Temperatur temp2 = new Temperatur(200);
        assertEquals(true, temp2.hashCode() == temp.hashCode());

    }

    @Test
    void testTestEqualsTrue() {
        assertEquals(true, new Temperatur().equals(new Temperatur()));
    }

    @Test
    void testTestEqualsFalse() {
        assertEquals(false, new Temperatur().equals(new Temperatur(200)));
    }

    @Test
    void testTestEqualsNull() {
        assertEquals(false, new Temperatur().equals(null));
    }

    @Test
    void testEqualsContract() {
        EqualsVerifier.forClass(Temperatur.class).suppress(Warning.NONFINAL_FIELDS).verify();
    }

    @Test
    void testCompareToBigger() {
        assertEquals(-1, new Temperatur().compareTo(new Temperatur(300)));
    }

    @Test
    void testCompareToEqual() {
        assertEquals(0, new Temperatur().compareTo(new Temperatur()));
    }

    @Test
    void testCompareToLess() {
        assertEquals(1, new Temperatur().compareTo(new Temperatur(200)));
    }

    @Test
    void testCompareToNull() {
        assertEquals(1, new Temperatur().compareTo(null));
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
    void testToString(){
        assertEquals("Temperatur{Kelvin=293.15K}", new Temperatur().toString());
    }


}