package ch.hslu.oop.mepprep.sw07.part1;

import nl.jqno.equalsverifier.EqualsVerifier;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonNameComparatorTest {

    @Test
    void testCompareBigger() {
        Person p1 = new Person(1,"Hans", "Peter");
        Person p2 = new Person(2, "Hans", "Qzasdasdasd");
        assertEquals(-1, new PersonNameComparator().compare(p1,p2));
    }

    @Test
    void testCompareLess() {
        Person p1 = new Person(1,"Hans", "Peter");
        Person p2 = new Person(2, "Hans", "Müller");
        assertEquals(3, new PersonNameComparator().compare(p1,p2));
    }

    @Test
    void testCompareEqual() {
        Person p1 = new Person(1,"Hans", "Peter");
        Person p2 = new Person(2, "Hans", "Peter");
        assertEquals(0, new PersonNameComparator().compare(p1,p2));
    }

    @Test
    void testCompareEqualLastname() {
        Person p1 = new Person(1,"Hans", "Peter");
        Person p2 = new Person(2, "Müller", "Peter");
        assertEquals(-5, new PersonNameComparator().compare(p1,p2));
    }

    @Test
    void testTestEquals() {
        assertEquals(true, new PersonNameComparator().equals(new PersonNameComparator()));
    }

    @Test
    void testTestToString() {
        assertEquals("PersonNameComparator", new PersonNameComparator().toString());
    }

    @Test
    void testTestHashCode() {
        assertEquals(true, new PersonNameComparator().hashCode() == new PersonNameComparator().hashCode());
    }

    @Test
    void  testEqualsContract(){
        EqualsVerifier.forClass(PersonNameComparator.class).verify();
    }
}