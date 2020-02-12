package ch.hslu.oop.mepprep.sw05.part1;

import ch.hslu.oop.mepprep.sw05.part1.Rectangle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RectangleTest {


    @Test
    void testChangeDimensions() {
        Rectangle rect = new Rectangle(10, 10, 10, 10);
        rect.changeDimensions(20, 40);
        assertEquals(20, rect.getWidth());
        assertEquals(40, rect.getHeight());
    }

    @Test
    void testGetPerimeter() {
        assertEquals(40, new Rectangle(10,10,5, 15).getPerimeter());
    }

    @Test
    void testGetArea() {
        assertEquals(100, new Rectangle(10,10,5,20).getArea());
    }
}