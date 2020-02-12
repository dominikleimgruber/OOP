package ch.hslu.oop.mepprep.sw10.part1;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.beans.PropertyChangeEvent;


public class Car implements Switchable {

    private Engine engine;
    private Light light;
    private static final Logger LOG = LogManager.getLogger(Car.class);

    public Car() {
        this.engine = new Engine();
        this.light = new Light();
        engine.addPropertyChangeListener(this::handleEngineEvent);
    }


    public void handleEngineEvent(PropertyChangeEvent evt) {
        LOG.info("New Value {}", evt.getNewValue());
    }

    @Override
    public void switchOn() {
        engine.switchOn();
        light.switchOn();
    }

    @Override
    public void switchOff() {
        engine.switchOff();
        light.switchOff();
    }

    @Override
    public boolean isSwitchedOn() {
        return engine.isSwitchedOn();
    }

    @Override
    public boolean isSwitchedOff() {
        return engine.isSwitchedOff();
    }

}
