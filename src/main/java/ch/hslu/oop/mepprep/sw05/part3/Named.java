package ch.hslu.oop.mepprep.sw05.part3;

/**
 * Interface, welches eine Namensgebung fordert.
 */
public interface Named {


    void setName(final String name);

    /**
     * Methode zur Namensabfrage
     *
     * @return {@code String} welcher den Namen beinhaltet.
     */
     String getName();

}
