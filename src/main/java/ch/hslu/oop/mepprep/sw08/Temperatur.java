package ch.hslu.oop.mepprep.sw08;


public final class Temperatur implements Comparable<Temperatur> {

    private float kelvin;
    private static final float KELVIN_OFFSET = 273.15f;


    public Temperatur() {
        this(293.15f);
    }

    public Temperatur(float kelvin) {
        if (kelvin >= 0) {
            this.kelvin = kelvin;
        } else {
            this.kelvin = 0f;
        }
    }

    public float getKelvin() {
        return kelvin;
    }

    public void setKelvin(float kelvin) {

        if (kelvin >= 0) {
            this.kelvin = kelvin;
        }

    }

    public float getCelsius() {
        return kelvinToCelsius(this.kelvin);
    }

    public void setCelsius(final float celcius) {
        kelvin = celcius + KELVIN_OFFSET;
    }

    public float getFahrenheit() {
        return (kelvinToCelsius(this.kelvin) * 1.8f) + 32;
    }


    @Override
    public final int hashCode() {
        return Float.hashCode(kelvin);
    }

    @Override
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Temperatur)) {
            return false;
        }
        Temperatur temp = (Temperatur) obj;
        return Float.compare(this.kelvin, temp.kelvin) == 0;
    }

    @Override
    public int compareTo(Temperatur o) {
        if (o == null) {
            return 1;
        }
        return Float.compare(this.kelvin, o.kelvin);
    }

    @Override
    public String toString() {
        return "Temperatur{Kelvin=" + this.kelvin + "K}";
    }

    public static float celsiusToKelvin(final float celsius) {
        return celsius + KELVIN_OFFSET;
    }

    public static float kelvinToCelsius(final float kelvin) {
        return kelvin - KELVIN_OFFSET;
    }
}
