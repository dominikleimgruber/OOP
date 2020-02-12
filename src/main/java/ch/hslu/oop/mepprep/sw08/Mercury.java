package ch.hslu.oop.mepprep.sw08;



public class Mercury extends AbstractElement {

    public Mercury() {
            this(new Temperatur(293.15f));
    }

    public Mercury(final Temperatur temperatur) {
        super("Mercury",629.88f ,234.32f, temperatur, 80);
    }


    @Override
    public String toString() {
        return super.toString() + "Mercury, caution: poisoning}";
    }


}
