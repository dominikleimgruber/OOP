package ch.hslu.oop.mepprep.sw02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TemperaturTest {

    @Test
    void testGetKelvin() {
        Temperatur temp = new Temperatur();
        assertEquals(293.15f, temp.getKelvin(), 0.001);
    }

    @Test
    void testSetKelvin() {
        Temperatur temp = new Temperatur();
        temp.setKelvin(123.12f);
        assertEquals(123.12f, temp.getKelvin(), 0.001);
    }

    @Test
    void testGetCelsius() {
        Temperatur temp = new Temperatur();
        assertEquals(20.0f, temp.getCelsius(), 0.001);
    }

    @Test
    void testGetFahrenheit() {
        Temperatur temp = new Temperatur();
        assertEquals(68.0f, temp.getFahrenheit(), 0.001);
    }

    @Test
    void testChangeTempPositiv() {
        Temperatur temp = new Temperatur(273.15f);
        temp.changeTemp(100.0f);
        assertEquals(373.15f, temp.getKelvin(), 0.001);
    }

    @Test
    void testChangeTempNegativ() {
        Temperatur temp = new Temperatur(273.15f);
        temp.changeTemp(-100.0f);
        assertEquals(173.15f, temp.getKelvin(), 0.001);
    }
}