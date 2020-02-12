package ch.hslu.oop.mepprep.sw11.part2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {

    private static final Logger LOG = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        MeasurementHistory measurements = new MeasurementHistory(ReadFile.readMeasurements("/Users/dominikleimgruber/Documents/work/Hochschule/HS19/OOP/SW11/temps.csv")) ;




        LOG.info(measurements.min());
        LOG.info(measurements.max());
        LOG.info(measurements.getAverage());

    }


}
