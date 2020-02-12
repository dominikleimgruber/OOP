package ch.hslu.oop.mepprep.sw08;





import nl.jqno.equalsverifier.EqualsVerifier;
import nl.jqno.equalsverifier.Warning;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NitrogenTest {


    @Test
    void testCheckAggregateLiquid() {

        assertEquals("Nitrogen is liquid by 70.0K.", new Nitrogen(new Temperatur(70.0f)).checkAggregate());
    }

    @Test
    void testCheckAggregateGas() {
        assertEquals("Nitrogen is gas by 172.12K.", new Nitrogen(new Temperatur(172.12f)).checkAggregate());
    }

    @Test
    void testCheckAggregateSolid() {
        assertEquals("Nitrogen is solid by 50.0K.", new Nitrogen(new Temperatur(50.0f)).checkAggregate());
    }


    @Test
    void testHashCodeTrue() {
        assertEquals(true,new Nitrogen().hashCode() == new Nitrogen().hashCode());
    }

    @Test
    void testHashCodeFalse() {
        assertEquals(false,new Nitrogen(new Temperatur(200)).hashCode() == new Nitrogen().hashCode());
    }

    @Test
    void testEqualsTrue() {
        assertEquals(true, new Nitrogen().equals(new Nitrogen()));
    }


    @Test
    void testEqualsFalse() {
        assertEquals(false, new Nitrogen().equals(new Nitrogen(new Temperatur(200))));
    }


    @Test
    void testEqualsNull() {
        assertEquals(false, new Nitrogen().equals(null));
    }

    @Test
    void testToString() {
        assertEquals("Element{Nitrogen}", new Nitrogen().toString());
    }

    @Test
    void testEqualsContract(){
        EqualsVerifier.forClass(Nitrogen.class).withIgnoredFields("boilingTemp", "meltingTemp","name").suppress(Warning.NONFINAL_FIELDS).verify();
    }

    @Test
    void testCompareToBigger(){
        assertEquals(-1, new Nitrogen().compareTo(new Mercury()));
    }

    @Test
    void testCompareToEqual(){
        assertEquals(0, new Nitrogen().compareTo(new Nitrogen()));
    }

    @Test
    void testCompareToLess(){
        assertEquals(1, new Mercury().compareTo(new Nitrogen()));
    }
}