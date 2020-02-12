package ch.hslu.oop.mepprep.sw10.part2.version1;

import java.util.ArrayList;
import java.util.Collection;

public class TemperaturHistory {

    private final Collection<Temperatur> temperatures;
    private Temperatur max;
    private Temperatur min;
    private Collection<TemperaturMaxListener> maxListeners;
    private Collection<TemperaturMinListener> minListeners;


    public TemperaturHistory() {
        this.temperatures = new ArrayList<>();
        maxListeners = new ArrayList<>();
        minListeners = new ArrayList<>();
    }

    public void add(final Temperatur temp) {

        if (temp != null) {
            temperatures.add(temp);
        }
        if (temp.compareTo(max) > 0) {
            final TemperaturMaxEvent tempEvent = new TemperaturMaxEvent(this, this.max, temp);
            max = temp;
            fireTemperatureMaxEvent(tempEvent);
        }
        if (temp.compareTo(min) < 0 || min == null) {
            final TemperaturMinEvent tempEvent = new TemperaturMinEvent(this, this.min, temp);
            min = temp;
            fireTemperatureMinEvent(tempEvent);
        }
    }

    public void clear() {
        temperatures.clear();
    }

    public long getCount() {
        return temperatures.size();
    }

    public Temperatur getMax() {
        return max;
    }

    public Temperatur getMin() {
        return min;
    }

    public Temperatur average() {
        if (getCount() != 0) {
            float sum = 0;
            for (Temperatur next : temperatures) {
                sum += next.getKelvin();
            }
            return Temperatur.createFromKelvin(sum / getCount());
        }
        return null;
    }


    public void addTemperaturMaxListener(TemperaturMaxListener listener) {
        if (listener != null) {
            maxListeners.add(listener);
        }
    }


    public void removeTemperaturMaxListener(TemperaturMaxListener listener) {
        maxListeners.remove(listener);
    }


    public void addTemperaturMinListener(TemperaturMinListener listener) {
        if (listener != null) {
            minListeners.add(listener);
        }
    }


    public void removeTemperaturMinListener(TemperaturMinListener listener) {
        minListeners.remove(listener);
    }

    @Override
    public String toString() {
        return "TemperaturHistory{" +
                "temperatures=" + temperatures.toString() + "}";
    }


    private void fireTemperatureMaxEvent(TemperaturMaxEvent event) {
        for (TemperaturMaxListener listener : maxListeners) {
            listener.temperaturMaxChange(event);
        }
    }

    private void fireTemperatureMinEvent(TemperaturMinEvent event) {
        for (TemperaturMinListener listener : minListeners) {
            listener.temperaturMinChange(event);
        }
    }
}
