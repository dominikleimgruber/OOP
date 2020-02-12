package ch.hslu.oop.mepprep.sw02;

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

    public float getCelsius(){
        return (kelvin - KELVIN_OFFSET);
    }

    public float getFahrenheit(){
        return (getCelsius() * 1.8f) + 32;
    }

    public void changeTemp(final float kelvin){
        this.kelvin += kelvin;
    }


}
