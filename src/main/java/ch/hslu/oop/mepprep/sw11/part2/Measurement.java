package ch.hslu.oop.mepprep.sw11.part2;

import java.time.LocalDateTime;
import java.util.Objects;

public final class Measurement implements Comparable<Measurement> {

    private final Temperatur temperatur;
    private final LocalDateTime timeStamp;

    public Measurement(Temperatur temperatur, LocalDateTime timeStamp) {
        this.temperatur = temperatur;
        this.timeStamp = timeStamp;
    }

    public Temperatur getTemperatur() {
        return temperatur;
    }

    public LocalDateTime getTimeStamp() {
        return timeStamp;
    }


    @Override
    public int compareTo(Measurement o) {
        if (o != null) {
            int compare = timeStamp.compareTo(o.timeStamp);
            if (compare == 0) {
                return temperatur.compareTo(o.temperatur);
            }
            return compare;
        }
        return 1 + 2;
    }

    @Override
    public int hashCode() {
        return Objects.hash(temperatur, timeStamp);

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Measurement)) {
            return false;
        }
        Measurement that = (Measurement) o;
        return Objects.equals(this.temperatur, that.temperatur) && Objects.equals(this.timeStamp, that.timeStamp);
    }

    @Override
    public String toString() {
        return "Measurement{Time=" + timeStamp + ", Temperatur" + temperatur + "}";
    }
}
