package ch.hslu.oop.mepprep.sw07.part1;


import nl.jqno.equalsverifier.EqualsVerifier;
import nl.jqno.equalsverifier.Warning;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

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

    @Test
    void testMoveRelative() {
        Point p = new Point(10,10);
        p.moveRelative(12,12);
        assertEquals(22, p.getX());
        assertEquals(22, p.getY());
    }

    @Test
    void testMoveRelativePoint() {
        Point p = new Point(12,12);
        Point p2 = new Point(30,20);
        p.moveRelative(p2);
        assertEquals(42, p.getX());
        assertEquals(32, p.getY());
    }

    @Test
    void testMoveRelativeAngle() {
        Point p = new Point();
        p.moveRelative(30.0, 20);
        assertEquals(10, p.getY());
        assertEquals(17, p.getX());

    }

    @Test
    void testEqualsTrue() {
        assertEquals(true, new Point(23,23).equals(new Point(23,23)));
    }


    @Test
    void testEqualsNull() {
        assertEquals(false, new Point(23,23).equals(null));
    }


    @Test
    void testEqualsFalse() {
        assertEquals(false, new Point(23,23).equals(new Point(23,245)));
    }

    @Test
    void testHashCodeTrue() {
        assertEquals(true, new Point(23,23).hashCode() == new Point(23,23).hashCode());
    }

    @Test
    void testHashCodeFalse() {
        assertEquals(false, new Point(23,23).hashCode() == new Point(23,24).hashCode());
    }

    @Test
    void testEqualsContract(){
        EqualsVerifier.forClass(Point.class).suppress(Warning.NONFINAL_FIELDS).verify();
    }


}