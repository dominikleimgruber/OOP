package ch.hslu.oop.mepprep.sw11.part2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.File;

public class checkFile {

    @Test
    void checkFile(){
        File file = new File("/Users/dominikleimgruber/Documents/work/Hochschule/HS19/OOP/SW11/temps.csv");
        assertEquals(true, file.exists());
    }
}
