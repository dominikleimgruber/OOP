package ch.hslu.oop.mepprep.sw11.part2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReadFileTest {

    @Test
    void testReadMeasurementsFileNotExisting() {
        assertEquals(0, ReadFile.readMeasurements("").size());
    }

    @Test
    void testReadMeasurementsFile() {
        assertEquals(25600,
                ReadFile.readMeasurements("/Users/dominikleimgruber/Documents/work/Hochschule/HS19/OOP/SW11/temps.csv").size());
    }
}