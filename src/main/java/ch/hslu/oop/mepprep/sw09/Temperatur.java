package ch.hslu.oop.mepprep.sw09;


public final class Temperatur implements Comparable<Temperatur>{

    private final float kelvin;
    private static final float KELVIN_OFFSET = 273.15f;



    private Temperatur(float kelvin)  {
        if (kelvin >= 0) {
            this.kelvin = kelvin;
        }else{
           throw new IllegalArgumentException("Value below 0 Kelvin or not a number.");
        }
    }

    public float getKelvin() {
        return kelvin;
    }

    public float getCelsius() {
        return kelvinToCelsius(this.kelvin);
    }

    public float getFahrenheit() {
        return (kelvinToCelsius(this.kelvin) * 1.8f) + 32;
    }


    public static float celsiusToKelvin(final float celsius){
        if (celsius > (-KELVIN_OFFSET)) {
            return celsius + KELVIN_OFFSET;
        }
        throw new IllegalArgumentException("Value below 0 Kelvin or not a number.");
    }

    public static float kelvinToCelsius(final float kelvin){
        if (kelvin >= 0) {
            return kelvin - KELVIN_OFFSET;
        }
        throw new IllegalArgumentException("Value below 0 Kelvin or not a number.");

    }

    public static Temperatur createFromKelvin(final float kelvin){
        return new Temperatur(kelvin);
    }

    public static Temperatur createFromCelsius(final float celsius){
        return new Temperatur(celsiusToKelvin(celsius));
    }


    @Override
    public final int hashCode() {
        return Float.hashCode(kelvin);
    }

    @Override
    public final boolean equals(Object obj) {
        if(this == obj){
            return true;
        }
        if( !(obj instanceof Temperatur)){
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
        return "Temperatur{Kelvin="+ this.kelvin + "K}";
    }
}
