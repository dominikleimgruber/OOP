package ch.hslu.oop.mepprep.sw04.part2;

public final class Point {

    private int x;
    private int y;


    public Point() {
        this(0,0);
    }

    public Point(final int x, final int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

}
