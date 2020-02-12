package ch.hslu.oop.mepprep.sw06.part3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {

    CalcInterface calc = new Calculator();

    @Test
    void testAdditionNormal() {
        assertEquals(20, calc.addition(10, 10));
    }

    @Test
    void testAdditionMaxValue() {
        assertEquals(2 * Integer.MAX_VALUE, calc.addition(Integer.MAX_VALUE, Integer.MAX_VALUE));
    }

    @Test
    void testAdditionZero() {
        assertEquals(0, new Calculator().addition(0, 0));
    }

    @Test
    void testAdditionNegativ() {
        assertEquals(-20, calc.addition(-10, -10));
    }

}