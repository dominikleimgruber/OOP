package ch.hslu.oop.mepprep.sw10.part2.version1;

import java.util.EventObject;

public class TemperaturMaxEvent extends EventObject {

    private final Temperatur oldValue;
    private final Temperatur newValue;

    public TemperaturMaxEvent(Object source, final Temperatur oldValue, final Temperatur newValue) {
        super(source);
        this.oldValue = oldValue;
        this.newValue = newValue;
    }


    public Temperatur getOldValue() {
        return oldValue;
    }

    public Temperatur getNewValue() {
        return newValue;
    }

    @Override
    public Object getSource() {
        return super.getSource();
    }

    @Override
    public String toString() {
        return "TemperaturMaxEvent{Source=" + source.toString() + "Old Value=" + oldValue + "new Value=" + newValue + "}";
    }
}
