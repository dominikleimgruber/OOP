package ch.hslu.oop.mepprep.sw07.part1;



public final class Mercury extends AbstractElement {

    public Mercury() {
            this(new Temperatur(293.15f));
    }

    public Mercury(final Temperatur temperatur) {
        super(629.88f ,234.32f, temperatur, 80);
    }


    @Override
    public String toString() {
        return super.toString() + "Mercury, caution: poisoning}";
    }


}
