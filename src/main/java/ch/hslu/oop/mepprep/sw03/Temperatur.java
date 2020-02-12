package ch.hslu.oop.mepprep.sw03;

public final class Temperatur {

    private float kelvin;
    private static final float KELVIN_OFFSET = 273.15f;


    public Temperatur() {
        this(293.15f);
    }

    public Temperatur(float kelvin) {
        this.kelvin = kelvin;
    }

    public float getKelvin() {
        return kelvin;
    }

    public void setKelvin(float kelvin) {
        this.kelvin = kelvin;
    }

    public float getCelsius() {
        return (kelvin - KELVIN_OFFSET);
    }

    public float getFahrenheit() {
        return (getCelsius() * 1.8f) + 32;
    }

    public void changeTemp(final float kelvin) {
        this.kelvin += kelvin;
    }

    public String aggregateState(final String element) {
        switch (element) {
            case "N":
                return checkAggregateState(63.15f, 77.15f);
            case "Hg":
                return checkAggregateState(234.32f, 629.88f);
            case "Pb":
                return checkAggregateState(600.61f, 2022.0f);
            default:
                return "Not a registered element";
        }
    }

    private String checkAggregateState(final float melting, final float boiling) {
        if (this.kelvin > boiling) {
            return "gas";
        } else if (this.kelvin < melting) {
            return "solid";
        } else {
            return "liquid";
        }
    }

}
