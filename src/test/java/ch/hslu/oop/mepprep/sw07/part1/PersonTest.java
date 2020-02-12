package ch.hslu.oop.mepprep.sw07.part1;

import nl.jqno.equalsverifier.EqualsVerifier;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void testConstructor(){
        Person p1 = new Person(1, "Dominik", "Leimgruber");
        assertEquals(1, p1.getId());
        assertEquals("Dominik", p1.getFirstname());
        assertEquals("Leimgruber", p1.getLastname());
    }

    @Test
    void testToString(){
        assertEquals("Person[id=1,Firstname=Dominik,Lastname=Leimgruber]", new Person(1, "Dominik", "Leimgruber").toString());
    }

    @Test
    void EqualContract(){
        EqualsVerifier.forClass(Person.class).withIgnoredFields("firstname", "lastname").verify();
    }

    @Test
    void testEqualsTrue(){
        Person p1 = new Person(1, "Dominik", "Leimgruber");
        Person p2 = new Person(1, "Dominik", "Leimgruber");
        assertEquals(true, p1.equals(p2));
    }

    @Test
    void testEqualsFalse(){
        Person p1 = new Person(1, "Marina", "Cerkez");
        Person p2 = new Person (2, "Dominik", "Leimgruber");
        assertEquals(false, p1.equals(p2));

    }
    @Test
    void testEqualsNull(){
        Person p1 = new Person(1, "Dominik", "Leimgruber");
        assertEquals(false, p1.equals(null));
    }


    @Test
    void testHashCodeTrue(){
        assertEquals(true, new Person(1,"Dominik" ,"Leimgruber").hashCode() ==
                new Person(1,"Dominik", "Leimgruber").hashCode());
    }

    @Test
    void testHashCodeFalse(){
        assertEquals(false, new Person(1,"Dominik" ,"Leimgruber").hashCode() ==
                new Person(2,"Marina", "Cerkez").hashCode());
    }

    @Test
    void testCompareToBigger(){

        assertEquals(-1, new Person(1, "Test", "test").compareTo(new Person(2, "resr", "test")));
    }

    @Test
    void testCompareToEqual(){
        assertEquals(0, new Person(1, "Test", "test").compareTo(new Person(1, "resr", "test")));
    }
    @Test
    void testCompareToLess(){
        assertEquals(1, new Person(2, "Test", "test").compareTo(new Person(1, "resr", "test")));
    }
    @Test
    void testCompareToNull(){
        assertEquals(1, new Person(1, "Test", "test").compareTo(null));
    }
}