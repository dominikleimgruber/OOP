package ch.hslu.oop.mepprep.sw05.part1;

public final class Rectangle extends Shape {

    private int width;
    private int height;

    public Rectangle(int x, int y, int width, int height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }

    public void changeDimensions(final int width, final int height){
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public int getPerimeter() {
        return 2 * (width + height);
    }

    @Override
    public int getArea() {
        return width * height;
    }
}
