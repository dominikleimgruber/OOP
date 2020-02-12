package ch.hslu.oop.mepprep.sw10.part2.version2;

import java.util.ArrayList;
import java.util.Collection;

public class TemperaturHistory {

    private final Collection<Temperatur> temperatures;
    private final Collection<TemperaturEventListener> listeners;
    private Temperatur min;
    private Temperatur max;

    public TemperaturHistory() {
        this.temperatures = new ArrayList<>();
        this.listeners = new ArrayList<>();
    }

    public void add(final Temperatur temp) {

        if (temp != null) {
            temperatures.add(temp);
        }
        if(temp.compareTo(max) > 0){
            final TemperaturEvent tempEvent = new TemperaturEvent(this, MinMax.MAX, temp);
            max = temp;
            fireTemperaturEvent(tempEvent);
        }

        if (temp.compareTo(min) < 0 || min == null){
            final TemperaturEvent tempEvent = new TemperaturEvent(this, MinMax.MIN, temp);
            min = temp;
            fireTemperaturEvent(tempEvent);
        }
    }

    public void clear() {
        temperatures.clear();
    }

    public long getCount() {
        return temperatures.size();
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

    public Temperatur getMin() {
        return min;
    }

    public Temperatur getMax() {
        return max;
    }


    public void addTemperaturEventListener(TemperaturEventListener listener){
        if (listener != null){
            listeners.add(listener);
        }
    }
    public void removeTemperaturEventListener(TemperaturEventListener listener){
        if (listener != null){
            listeners.remove(listener);
        }
    }

    @Override
    public String toString() {
        return "TemperaturHistory{" +
                "temperatures=" + temperatures.toString() + "}";
    }


    private void fireTemperaturEvent(TemperaturEvent event){
        for (TemperaturEventListener listener : listeners){
            listener.minMaxChange(event);
        }
    }
}
