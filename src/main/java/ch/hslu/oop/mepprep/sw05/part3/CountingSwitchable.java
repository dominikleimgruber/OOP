package ch.hslu.oop.mepprep.sw05.part3;

/**
 * Erweitererung des Switchable-Interfaces. Es verpflichtet zusätzlich zur Implementation einer Methode, die
 * die Anzahl Ein- und Ausschaltungen bereitstellen soll.
 */

public interface CountingSwitchable extends Switchable {

    /**
     * Methode zur Ausgabe des Zählers der Statusänderungen.
     * @return Anzahl Statusänderungen.
     */
    long getSwitchCount();

}
