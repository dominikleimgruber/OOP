package ch.hslu.oop.mepprep.sw08;




public class Nitrogen extends AbstractElement {


    public Nitrogen() {
        this(new Temperatur(293.15f));
    }

    public Nitrogen(final Temperatur temperatur) {
        super("Nitrogen",77.15f, 63.15f, temperatur, 7);
    }

    @Override
    public String toString() {
        return super.toString() + "Nitrogen}";
    }


}
