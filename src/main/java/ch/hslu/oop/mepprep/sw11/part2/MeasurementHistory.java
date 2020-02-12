package ch.hslu.oop.mepprep.sw11.part2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MeasurementHistory {


    private static final Logger LOG = LogManager.getLogger(MeasurementHistory.class);
    private List<Measurement> measurements;

    public MeasurementHistory() {
        this(new ArrayList<>());
    }

    public MeasurementHistory(List<Measurement> measurements) {
        this.measurements = measurements;
    }

    public void add(final Measurement measurement) {
        if (measurement != null) {
            measurements.add(measurement);
        }
    }

    public void clear() {
        measurements.clear();
    }

    public long getCount() {
        return measurements.size();
    }

    public Measurement min() {

        return measurements.stream()
                .min(Comparator.comparing(m -> m.getTemperatur().getKelvin()))
                .orElse(null);
    }

    public Measurement max() {
        return measurements.stream()
                .max(Comparator.comparing(m -> m.getTemperatur().getKelvin()))
                .orElse(null);
    }

    public Temperatur getAverage() {
        if (getCount() != 0) {
            float sum = 0;
            for (Measurement measurement : measurements) {
                sum += measurement.getTemperatur().getKelvin();
            }
            return Temperatur.createFromKelvin(sum / this.getCount());
        }
        return null;
    }



}
