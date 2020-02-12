package ch.hslu.oop.mepprep.sw04.part2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PointTest {

    @Test
    void testSetX() {
        Point point = new Point();
        point.setX(23);
        assertEquals(23, point.getX());
    }

    @Test
    void testSetY() {
        Point point = new Point();
        point.setY(23);
        assertEquals(23, point.getY());
    }
}