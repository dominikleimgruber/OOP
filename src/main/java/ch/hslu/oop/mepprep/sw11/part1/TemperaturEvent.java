package ch.hslu.oop.mepprep.sw11.part1;

import java.util.EventObject;

public class TemperaturEvent extends EventObject {
    private MinMax state;
    private Temperatur newValue;

    public TemperaturEvent(Object source, MinMax state, Temperatur newValue) {
        super(source);
        this.state = state;
        this.newValue = newValue;
    }

    public MinMax getState() {
        return state;
    }

    public Temperatur getNewValue() {
        return newValue;
    }

}
