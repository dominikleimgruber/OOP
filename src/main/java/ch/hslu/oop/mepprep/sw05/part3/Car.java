package ch.hslu.oop.mepprep.sw05.part3;

public class Car implements CountingSwitchable, Named {

    private Switchable engine;
    private Switchable light;
    private long counter;
    private String name;

    public Car() {
        this("noname");
    }

    public Car(final String name) {
        this.engine = new Engine();
        this.light = new Light();
        this.counter = 0;
        this.name = name;
    }

    @Override
    public void switchOn() {
        engine.switchOn();
        light.switchOn();
        counter++;
    }

    @Override
    public void switchOff() {
        engine.switchOff();
        light.switchOff();
        counter++;
    }

    @Override
    public boolean isSwitchedOn() {
        return engine.isSwitchedOn();
    }

    @Override
    public boolean isSwitchedOff() {
        return engine.isSwitchedOff();
    }

    @Override
    public long getSwitchCount() {
        return counter;
    }

    @Override
    public void setName(final String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
