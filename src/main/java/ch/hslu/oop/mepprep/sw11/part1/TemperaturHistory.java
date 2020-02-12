package ch.hslu.oop.mepprep.sw11.part1;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class TemperaturHistory {

    private static final Logger LOG = LogManager.getLogger(TemperaturHistory.class);
    private final List<Temperatur> temperatures;
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
        if (temp.compareTo(max) > 0) {
            final TemperaturEvent tempEvent = new TemperaturEvent(this, MinMax.MAX, temp);
            max = temp;
            fireTemperaturEvent(tempEvent);
        }

        if (temp.compareTo(min) < 0 || min == null) {
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


    public void addTemperaturEventListener(TemperaturEventListener listener) {
        if (listener != null) {
            listeners.add(listener);
        }
    }

    public void removeTemperaturEventListener(TemperaturEventListener listener) {
        if (listener != null) {
            listeners.remove(listener);
        }
    }

    @Override
    public String toString() {
        return "TemperaturHistory{" +
                "temperatures=" + temperatures.toString() + "}";
    }

    public void readData(final String path) {
        File file = new File(path);
        if (file.exists()) {
            try (DataInputStream dis = new DataInputStream(new FileInputStream(file))) {

                System.out.println("Number of Temperatures: " + dis.readLong());
                for (int i = 0; i < dis.available(); i++) {
                    add(Temperatur.createFromKelvin(dis.readFloat()));
                    System.out.println(temperatures.get(i));
                }
            } catch (IOException e) {
                LOG.error(e);
            }

        }

    }

    public void writeData(final String path) {

        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(path))) {
            dos.writeLong(getCount());
            for(Temperatur temp : temperatures){
                dos.writeFloat(temp.getKelvin());
            }
        } catch (IOException e) {
            LOG.error(e);
        }

    }

    private void fireTemperaturEvent(TemperaturEvent event) {
        for (TemperaturEventListener listener : listeners) {
            listener.minMaxChange(event);
        }
    }
}
