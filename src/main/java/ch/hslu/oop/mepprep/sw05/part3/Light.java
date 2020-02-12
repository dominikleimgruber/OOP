package ch.hslu.oop.mepprep.sw05.part3;

public class Light implements Switchable {

    private int lumen;

    public Light() {
        this.lumen = 0;
    }

    @Override
    public void switchOn() {
        this.lumen = 1200;
    }

    @Override
    public void switchOff() {
        this.lumen = 0;
    }

    @Override
    public boolean isSwitchedOn() {
        return lumen > 0;
    }

    @Override
    public boolean isSwitchedOff() {
        return !isSwitchedOn();
    }

    public int getLumen() {
        return lumen;
    }

    public void setLumen(int lumen) {
        this.lumen = lumen;
    }
}
