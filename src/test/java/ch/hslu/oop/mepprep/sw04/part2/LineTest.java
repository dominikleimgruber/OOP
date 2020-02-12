package ch.hslu.oop.mepprep.sw04.part2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LineTest {

    @Test
    void testSetStart() {
        Line line = new Line(10,10,20,20);
        Point start = new Point(15, 17);
        line.setStart(start);
        start.setX(123);
        assertEquals(15, line.getStart().getX());
        assertEquals(17, line.getStart().getY());
    }

    @Test
    void testSetEnd() {
        Line line = new Line(10,10,20,20);
        Point end = new Point(15, 17);
        line.setEnd(end);
        end.setX(123);
        System.out.println(end.getX());
        assertEquals(15, line.getEnd().getX());
        assertEquals(17, line.getEnd().getY());
    }

    @Test
    void testSetStartxy() {
        Line line = new Line(10,10,20,20);
        line.setStart(0,100);
        assertEquals(0, line.getStart().getX());
        assertEquals(100, line.getStart().getY());
    }

    @Test
    void testSetEndxy() {
        Line line = new Line(10,10,20,20);
        line.setEnd(0,100);
        assertEquals(0, line.getEnd().getX());
        assertEquals(100, line.getEnd().getY());
    }
}