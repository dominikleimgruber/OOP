package ch.hslu.oop.mepprep.sw05.part3;

public final class Engine implements CountingSwitchable {

    private final int maxRPM = 9000;
    private int rpm;
    private long counter;

    public Engine() {
        this(0);
    }

    public Engine(int rpm) {
        this.rpm = rpm;
    }


    public void setRpm(int rpm) {
        switchOn();
        if (rpm <= maxRPM && rpm > 0) {
            this.rpm = rpm;
        } else if (rpm <= 0) {
            switchOff();
        } else {
            this.rpm = maxRPM;
        }
    }

    public int getRpm() {
        return rpm;
    }

    @Override
    public void switchOn() {
        if (isSwitchedOff()) {
            this.rpm = 2000;
            counter++;
        }
    }

    @Override
    public void switchOff() {
        if (isSwitchedOn()) {
            this.rpm = 0;
            counter++;
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

    @Override
    public long getSwitchCount() {
        return counter;
    }
}
