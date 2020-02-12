package ch.hslu.oop.mepprep.sw04.part1;

public class Car implements Switchable{

    private Switchable engine;
    private Switchable light;

    public Car() {
        this.engine = new Engine();
        this.light = new Light();
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
