package ch.hslu.oop.mepprep.sw11.part2;

import nl.jqno.equalsverifier.EqualsVerifier;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

class MeasurementTest {



    @Test
    void testCompareTo() {
        Measurement measurement = new Measurement(Temperatur.createFromKelvin(200.0f),
                LocalDateTime.of(LocalDate.of(2019,10,10), LocalTime.of(12,0,0)));
        Measurement measurement2 = new Measurement(Temperatur.createFromKelvin(200.0f),
                LocalDateTime.of(LocalDate.of(2019,11,10), LocalTime.of(12,0,0)));
        assertEquals(1, measurement2.compareTo(measurement));
    }

    @Test
    void testCompareToEqualTime() {
        Measurement measurement = new Measurement(Temperatur.createFromKelvin(200.0f),
                LocalDateTime.of(LocalDate.of(2019,10,10), LocalTime.of(12,0,0)));
        Measurement measurement2 = new Measurement(Temperatur.createFromKelvin(300.0f),
                LocalDateTime.of(LocalDate.of(2019,10,10), LocalTime.of(12,0,0)));
        assertEquals(1, measurement2.compareTo(measurement));
    }


    @Test
    void EqualsContract(){
        EqualsVerifier.forClass(Measurement.class).verify();
    }

}