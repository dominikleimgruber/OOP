package ch.hslu.oop.mepprep.sw10.part1;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.Collection;

public final class Engine implements Switchable {

    private final int maxRPM = 9000;
    private int rpm;
    private State currentState;
    private final Collection<PropertyChangeListener> listeners = new ArrayList<>();

    public Engine() {
        rpm = 0;
        currentState = State.OFF;
    }

    public void setRpm(int rpm) {
        if (rpm <= maxRPM && rpm > 0) {
            this.rpm = rpm;
        } else if (rpm <= 0) {
            switchOff();
        } else {
            failure();

        }
    }

    public int getRpm() {
        return rpm;
    }


    public void addPropertyChangeListener(PropertyChangeListener listener) {
        if (listener != null) {
            listeners.add(listener);
        }
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        listeners.remove(listener);
    }


    @Override
    public void switchOn() {

        if (!isSwitchedOn()) {
            this.rpm = 2000;
            this.currentState = State.ON;
            final PropertyChangeEvent pcEvent = new PropertyChangeEvent(this, "turn on", State.OFF, State.ON);
            firePropertyChangeEvent(pcEvent);
        }
    }

    @Override
    public void switchOff() {
        if (isSwitchedOn()) {
            this.rpm = 0;
            this.currentState = State.OFF;
            final PropertyChangeEvent pcEvent = new PropertyChangeEvent(this, "turn on", State.ON, State.OFF);
            firePropertyChangeEvent(pcEvent);
        }
    }

    @Override
    public boolean isSwitchedOn() {
        return rpm > 0;
    }

    @Override
    public boolean isSwitchedOff() {
        return !isSwitchedOn();
    }

    private void failure() {
        currentState = State.FAILURE;
    }

    private void firePropertyChangeEvent(PropertyChangeEvent pcEvent) {
        for (PropertyChangeListener listener : listeners) {
            listener.propertyChange(pcEvent);
        }
    }


}
