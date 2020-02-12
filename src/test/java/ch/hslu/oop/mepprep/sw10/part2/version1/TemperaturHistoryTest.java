package ch.hslu.oop.mepprep.sw10.part2.version1;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TemperaturHistoryTest {

    @Test
    void testAdd() {
        TemperaturHistory temps = new TemperaturHistory();
        temps.add(Temperatur.createFromKelvin(293.15f));
        assertEquals(1, temps.getCount());
    }

    @Test
    void testClear() {
        TemperaturHistory temps = new TemperaturHistory();
        temps.add(Temperatur.createFromKelvin(293.15f));
        temps.clear();
        assertEquals(0, temps.getCount());
    }


    @Test
    void testTestToString() {
        TemperaturHistory temps = new TemperaturHistory();
        temps.add(Temperatur.createFromKelvin(293.15f));

        assertEquals("TemperaturHistory{temperatures=[Temperatur{Kelvin=293.15K}]}", temps.toString());
    }

    @Test
    void testGetMax(){
        TemperaturHistory temps = new TemperaturHistory();
        temps.add(Temperatur.createFromKelvin(293.15f));
        temps.add(Temperatur.createFromKelvin(400f));
        temps.add(Temperatur.createFromKelvin(350));
        assertEquals(400.0f, temps.getMax().getKelvin());
    }

    @Test
    void testGetMaxNull(){
        TemperaturHistory temps = new TemperaturHistory();
        assertEquals(null, temps.getMax());
    }



    @Test
    void testMin(){
        TemperaturHistory temps = new TemperaturHistory();
        temps.add(Temperatur.createFromKelvin(293.15f));
        temps.add(Temperatur.createFromKelvin(400f));
        temps.add(Temperatur.createFromKelvin(350));
        assertEquals(293.15f, temps.getMin().getKelvin());
    }

    @Test
    void testMinNull(){
        TemperaturHistory temps = new TemperaturHistory();
        assertEquals(null, temps.getMin());
    }

    @Test
    void testAverage(){
        TemperaturHistory temps = new TemperaturHistory();
        temps.add(Temperatur.createFromKelvin(150));
        temps.add(Temperatur.createFromKelvin(400));
        temps.add(Temperatur.createFromKelvin(350));
        assertEquals(300f, temps.average().getKelvin(), 0.01);
    }
}