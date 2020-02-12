package ch.hslu.oop.mepprep.sw08;


import java.util.Objects;

public class AbstractElement implements Comparable<AbstractElement> {
    private final float boilingTemp;
    private final float meltingTemp;
    private Temperatur temperatur;
    private final int protonNumber;
    private final String name;

    public AbstractElement(final String name, float boilingTemp, float meltingTemp, Temperatur temperatur, int protonNumber) {
        this.boilingTemp = boilingTemp;
        this.meltingTemp = meltingTemp;
        this.temperatur = temperatur;
        this.protonNumber = protonNumber;
        this.name = name;
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
        AggregateState currentState;
        if (kelvin > boilingTemp) {
            currentState = AggregateState.GAS ;
        } else if (kelvin < meltingTemp) {
            currentState = AggregateState.SOLID;
        } else {
            currentState = AggregateState.LIQUID;
        }

         return name + " is " + currentState.getStringValue() + " by " + temperatur.getKelvin() + "K.";

    }


    @Override
    public final int hashCode() {
        return Objects.hash(protonNumber, temperatur);
    }

    @Override
    public final boolean equals(Object o) {
        if(this == o){
            return true;
        }
        if(!(o instanceof AbstractElement)){
            return false;
        }
        AbstractElement that = (AbstractElement) o;
        return Integer.compare(this.protonNumber, that.protonNumber) == 0
                && Objects.equals(this.temperatur, that.temperatur);
    }

    @Override
    public String toString() {
        return "Element{";
    }

    @Override
    public int compareTo(AbstractElement o) {
        if (o == null) {
            return 1;
        }
        return Integer.compare(this.protonNumber, o.protonNumber);
    }
}
