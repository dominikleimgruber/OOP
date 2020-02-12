package ch.hslu.oop.mepprep.sw11.part2;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MeasurementHistoryTest {

    @Test
    void testAdd() {

        Measurement measurement = new Measurement(Temperatur.createFromKelvin(200.0f),
                LocalDateTime.of(LocalDate.of(2019, 10, 10), LocalTime.of(12, 0, 0)));
        Measurement measurement2 = new Measurement(Temperatur.createFromKelvin(200.0f),
                LocalDateTime.of(LocalDate.of(2019, 11, 10), LocalTime.of(12, 0, 0)));

        MeasurementHistory measurements = new MeasurementHistory();
        measurements.add(measurement);
        measurements.add(measurement2);
        assertEquals(2, measurements.getCount());
    }

    @Test
    void testClear() {
        Measurement measurement = new Measurement(Temperatur.createFromKelvin(200.0f),
                LocalDateTime.of(LocalDate.of(2019, 10, 10), LocalTime.of(12, 0, 0)));
        Measurement measurement2 = new Measurement(Temperatur.createFromKelvin(200.0f),
                LocalDateTime.of(LocalDate.of(2019, 11, 10), LocalTime.of(12, 0, 0)));
        assertEquals(1, measurement2.compareTo(measurement));

        MeasurementHistory measurements = new MeasurementHistory();
        measurements.add(measurement);
        measurements.add(measurement2);
        measurements.clear();
        assertEquals(0, measurements.getCount());
    }



    @Test
    void testMin() {
        Measurement measurement = new Measurement(Temperatur.createFromKelvin(200.0f),
                LocalDateTime.of(LocalDate.of(2019, 10, 10), LocalTime.of(12, 0, 0)));
        Measurement measurement2 = new Measurement(Temperatur.createFromKelvin(300f),
                LocalDateTime.of(LocalDate.of(2019, 11, 10), LocalTime.of(12, 0, 0)));
        assertEquals(1, measurement2.compareTo(measurement));

        MeasurementHistory measurements = new MeasurementHistory();
        measurements.add(measurement);
        measurements.add(measurement2);
        assertEquals(200.0f, measurements.min().getTemperatur().getKelvin());
    }

    @Test
    void testMax() {
        Measurement measurement = new Measurement(Temperatur.createFromKelvin(200.0f),
                LocalDateTime.of(LocalDate.of(2019, 10, 10), LocalTime.of(12, 0, 0)));
        Measurement measurement2 = new Measurement(Temperatur.createFromKelvin(300.0f),
                LocalDateTime.of(LocalDate.of(2019, 11, 10), LocalTime.of(12, 0, 0)));

        MeasurementHistory measurements = new MeasurementHistory();
        measurements.add(measurement);
        measurements.add(measurement2);
        assertEquals(300.0f, measurements.max().getTemperatur().getKelvin());
    }

    @Test
    void testGetAverage() {
        Measurement measurement = new Measurement(Temperatur.createFromKelvin(200.0f),
                LocalDateTime.of(LocalDate.of(2019, 10, 10), LocalTime.of(12, 0, 0)));
        Measurement measurement2 = new Measurement(Temperatur.createFromKelvin(300f),
                LocalDateTime.of(LocalDate.of(2019, 11, 10), LocalTime.of(12, 0, 0)));


        MeasurementHistory measurements = new MeasurementHistory();
        measurements.add(measurement);
        measurements.add(measurement2);
        assertEquals(250.0f, measurements.getAverage().getKelvin());
    }


}