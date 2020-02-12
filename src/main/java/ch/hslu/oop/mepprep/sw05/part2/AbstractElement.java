package ch.hslu.oop.mepprep.sw05.part2;

public class AbstractElement {
    private final float boilingTemp;
    private final float meltingTemp;
    private Temperatur temperatur;

    public AbstractElement(float boilingTemp, float meltingTemp, Temperatur temperatur) {
        this.boilingTemp = boilingTemp;
        this.meltingTemp = meltingTemp;
        this.temperatur = temperatur;
    }

    public float getBoilingTemp() {
        return boilingTemp;
    }

    public float getMeltingTemp() {
        return meltingTemp;
    }

    public Temperatur getTemperatur() {
        return new Temperatur(temperatur.getKelvin());
    }

    public void setTemperatur(Temperatur temperatur) {
        this.temperatur.setKelvin(temperatur.getKelvin());
    }

    public String checkAggregate() {
        float kelvin = temperatur.getKelvin();
        if (kelvin > boilingTemp) {
            return "gas";
        } else if (kelvin < meltingTemp) {
            return "solid";
        } else {
            return "liquid";
        }

    }
}
