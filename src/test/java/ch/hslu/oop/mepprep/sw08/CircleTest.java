package ch.hslu.oop.mepprep.sw08;



import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CircleTest {

    @Test
    void testMove() {
        Shape circle = new Circle(10,10,10);
        circle.move(20,20);
        assertEquals(20, circle.getX());
        assertEquals(20, circle.getY());
    }

    @Test
    void testSetDiameter() {
        Shape circle2 = new Circle(0, 0, 10);
        Circle circle = (Circle) circle2;
        circle.setDiameter(20);
        assertEquals(20, circle.getDiameter());
    }

    @Test
    void testGetPerimeter() {

        assertEquals((int) Math.PI * 10, new Circle(10, 10, 10).getPerimeter());

    }

    @Test
    void testGetArea() {
        assertEquals((int) (Math.pow(5, 2) * Math.PI), new Circle(10, 10, 10).getArea());
    }
}