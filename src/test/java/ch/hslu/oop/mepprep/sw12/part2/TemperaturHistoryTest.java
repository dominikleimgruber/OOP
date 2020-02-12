package ch.hslu.oop.mepprep.sw12.part2;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TemperaturHistoryTest {

    @Test
    void testAdd() {
        TemperaturHistory temps = new TemperaturHistory();
        temps.add(new Temperatur());
        assertEquals(1, temps.getCount());
    }

    @Test
    void testClear() {
        TemperaturHistory temps = new TemperaturHistory();
        temps.add(new Temperatur());
        temps.clear();
        assertEquals(0, temps.getCount());
    }


    @Test
    void testTestToString() {
        TemperaturHistory temps = new TemperaturHistory();
        temps.add(new Temperatur());

        assertEquals("TemperaturHistory{temperatures=[Temperatur{Kelvin=293.15K}]}", temps.toString());
    }

    @Test
    void testMaxForEach(){
        TemperaturHistory temps = new TemperaturHistory();
        temps.add(new Temperatur());
        temps.add(new Temperatur(400f));
        temps.add(new Temperatur(350));
        assertEquals(400.0f, temps.maxForEach().getKelvin());
    }

    @Test
    void testMaxForEachNull(){
        TemperaturHistory temps = new TemperaturHistory();
        assertEquals(null, temps.maxForEach());
    }
    @Test
    void testMaxIteratorNull(){
        TemperaturHistory temps = new TemperaturHistory();
        assertEquals(null, temps.maxIterator());
    }

    @Test
    void testMaxCollectionsNull(){
        TemperaturHistory temps = new TemperaturHistory();
        assertEquals(null, temps.maxCollections());
    }



    @Test
    void testMaxIterator(){
        TemperaturHistory temps = new TemperaturHistory();
        temps.add(new Temperatur());
        temps.add(new Temperatur(400f));
        temps.add(new Temperatur(350));
        assertEquals(400.0f, temps.maxIterator().getKelvin());
    }

    @Test
    void testMaxCollections(){
        TemperaturHistory temps = new TemperaturHistory();
        temps.add(new Temperatur());
        temps.add(new Temperatur(400f));
        temps.add(new Temperatur(350));
        assertEquals(400.0f, temps.maxCollections().getKelvin());
    }
    @Test
    void testMaxStream(){
        TemperaturHistory temps = new TemperaturHistory();
        temps.add(new Temperatur());
        temps.add(new Temperatur(400f));
        temps.add(new Temperatur(350));
        assertEquals(400.0f, temps.maxStream().getKelvin());
    }


    @Test
    void testMaxStreamNull(){
        TemperaturHistory temps = new TemperaturHistory();
        assertEquals(null, temps.maxStream());
    }




    @Test
    void testMin(){
        TemperaturHistory temps = new TemperaturHistory();
        temps.add(new Temperatur());
        temps.add(new Temperatur(400f));
        temps.add(new Temperatur(350));
        assertEquals(293.15f, temps.min().getKelvin());
    }
    @Test
    void testMinStream(){
        TemperaturHistory temps = new TemperaturHistory();
        temps.add(new Temperatur());
        temps.add(new Temperatur(400f));
        temps.add(new Temperatur(350));
        assertEquals(293.15f, temps.minStream().getKelvin());
    }

    @Test
    void testMinNull(){
        TemperaturHistory temps = new TemperaturHistory();
        assertEquals(null, temps.min());
    }

    @Test
    void testAverage(){
        TemperaturHistory temps = new TemperaturHistory();
        temps.add(new Temperatur(150));
        temps.add(new Temperatur(400));
        temps.add(new Temperatur(350));
        assertEquals(300f, temps.average().getKelvin(), 0.01);
    }
}