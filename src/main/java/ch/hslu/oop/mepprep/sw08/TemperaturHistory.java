package ch.hslu.oop.mepprep.sw08;

import java.util.*;

public class TemperaturHistory {

    private final Collection<Temperatur> temperatures;

    public TemperaturHistory() {
        this.temperatures = new HashSet<>();
    }

    public void add(final Temperatur temp) {

        if (temp != null) {
            temperatures.add(temp);
        }
    }

    public void clear() {
        temperatures.clear();
    }

    public long getCount() {
        return temperatures.size();
    }


    public Temperatur maxIterator() {
        if (temperatures.size() != 0) {
            Iterator<Temperatur> i = temperatures.iterator();
            Temperatur max = i.next();
            while (i.hasNext()) {
                Temperatur next = i.next();
                if (next.compareTo(max) > 0) {
                    max = next;
                }
            }
            return max;
        }
        return null;
    }

    public Temperatur maxForEach() {
        if (getCount() != 0) {
            Temperatur max = null;
            for (Temperatur next : temperatures) {
                if (next.compareTo(max) > 0) {
                    max = next;
                }
            }
            return max;
        }
        return null;
    }

    public Temperatur maxCollections() {
        if (getCount() != 0) {
            return Collections.max(temperatures);
        }
        return null;
    }

    public Temperatur min() {
        if (getCount() != 0) {
            return Collections.min(temperatures);
        }
        return null;
    }

    public Temperatur average() {
        if (getCount() != 0) {
            float sum = 0;
            for (Temperatur next : temperatures) {
                sum += next.getKelvin();
            }
            return new Temperatur(sum/getCount());
        }
        return null;
    }

    @Override
    public String toString() {
        return "TemperaturHistory{" +
                "temperatures=" + temperatures.toString() + "}";
    }
}
