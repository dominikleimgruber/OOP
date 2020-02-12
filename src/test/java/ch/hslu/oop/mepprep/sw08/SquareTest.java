package ch.hslu.oop.mepprep.sw08;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SquareTest {

    @Test
    void testSetSide() {
        Square sq = new Square(10, 10, 10);
        sq.setSide(5);
        assertEquals(5, sq.getSide());
    }

    @Test
    void testGetPerimeter() {
        assertEquals(20, new Square(10, 10, 5).getPerimeter());
    }

    @Test
    void testGetArea() {
        assertEquals(25, new Square(10, 10, 5).getArea());
    }
}