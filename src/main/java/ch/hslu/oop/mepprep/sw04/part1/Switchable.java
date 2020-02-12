package ch.hslu.oop.mepprep.sw04.part1;

/**
 * Interface zur Definierung eines Schalters.
 *
 */


public interface Switchable {

    /**
     * Methode zur Einschaltung des Schalters.
     */
    void switchOn();

    /**
     * Methode zur Ausschaltung eines Schalters.
     */
    void switchOff();

    /**
     * Methode zur Prüfung, ob sich der Schalter im eingeschaltenen Zustand befindet.
     *
     * @return {@code true} oder {@code false}
     */
    boolean isSwitchedOn();

    /**
     * Methode zur Prüfung, ob sich der Schalter im  ausgeschaltenen Zustand befindet.
     *
     * @return {@code true} oder {@code false}
     */
    boolean isSwitchedOff();

}
