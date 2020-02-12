package ch.hslu.oop.mepprep.sw07.part1;


public final class Nitrogen extends AbstractElement {


    public Nitrogen() {
        this(new Temperatur(293.15f));
    }

    public Nitrogen(final Temperatur temperatur) {
        super(77.15f, 63.15f, temperatur, 7);
    }

    @Override
    public String toString() {
        return super.toString() + "Nitrogen}";
    }


}
