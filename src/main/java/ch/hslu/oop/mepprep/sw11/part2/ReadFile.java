package ch.hslu.oop.mepprep.sw11.part2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.io.*;
import java.nio.charset.Charset;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {

    private static final Logger LOG = LogManager.getLogger(ReadFile.class);

    public static List<Measurement> readMeasurements(final String path) {
        List<Measurement> measurments = new ArrayList<>();

        File file = new File(path);
        if (file.exists()) {

            try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file), Charset.forName("UTF-8")))) {
                String line;
                String[] parts;
                while ((line = br.readLine()) != null) {
                    parts = line.split(";");
                    Temperatur temp = Temperatur.createFromCelsius(Float.valueOf(parts[2]));

                    LocalDateTime timestamp = readTimestamp(parts[1], "\"yyyy/MM/dd HH:mm:ss\"");
                    measurments.add(new Measurement(temp, timestamp));
                    LOG.info("New Measurement read");
                }
            } catch (IOException | IllegalArgumentException e) {
                LOG.error(e);
            }
        }
        return measurments;
    }

    private static LocalDateTime readTimestamp(String timestamp, String pattern) {
        return LocalDateTime.parse(timestamp, DateTimeFormatter.ofPattern(pattern));
    }
}
