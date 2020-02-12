package ch.hslu.oop.mepprep.sw08;

public final class Square extends Shape {

    private int side;

    public Square(int x, int y, int side) {
        super(x, y);
        this.side = side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    @Override
    public int getPerimeter() {
        return 4 * side;
    }

    @Override
    public int getArea() {
        return (int) Math.pow(side, 2);
    }
}
