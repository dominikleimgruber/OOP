package ch.hslu.oop.mepprep.sw04.part1;

public final class Engine implements Switchable {

    private final int maxRPM = 9000;
    private int rpm;

    public Engine() {
        this(0);
    }

    public Engine(int rpm) {
        this.rpm = rpm;
    }


    public void setRpm(int rpm) {
        if (rpm <= maxRPM && rpm >= 0) {
            this.rpm = rpm;
        }else if(rpm <= 0){
            switchOff();
        }else{
            this.rpm = maxRPM;
        }
    }

    public int getRpm() {
        return rpm;
    }

    @Override
    public void switchOn() {
        this.rpm = 2000;
    }

    @Override
    public void switchOff() {
        this.rpm = 0;
    }

    @Override
    public boolean isSwitchedOn() {
        return rpm > 0;
    }

    @Override
    public boolean isSwitchedOff() {
        return !isSwitchedOn();
    }


}
