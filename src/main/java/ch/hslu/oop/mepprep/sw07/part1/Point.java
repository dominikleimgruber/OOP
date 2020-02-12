package ch.hslu.oop.mepprep.sw07.part1;

import java.util.Objects;

public final class Point {

    private int x;
    private int y;


    public Point() {
        this(0, 0);
    }

    public Point(final int x, final int y) {
        this.x = x;
        this.y = y;
    }

    public Point(Point point) {
        this(point.getX(), point.getY());
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

    public void moveRelative(final int x, final int y) {

        this.x += x;
        this.y += y;

    }

    public void moveRelative(final Point point) {
        moveRelative(point.getX(), point.getY());
    }

    public void moveRelative(final double angle, final int value) {
        double radAngle = (Math.PI / 180) * angle;
        moveRelative((int) Math.round(Math.cos(radAngle) * value), (int) Math.round(Math.sin(radAngle) * value));
    }


    @Override
    public final boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Point)) {
            return false;
        }
        Point point = (Point) o;
        return Integer.compare(this.x, point.x) == 0 && Integer.compare(this.y, point.y) == 0;
    }

    @Override
    public final int hashCode() {
        return Objects.hash(x, y);
    }
}
