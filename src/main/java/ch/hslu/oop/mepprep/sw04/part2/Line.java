package ch.hslu.oop.mepprep.sw04.part2;

public final class Line {

    private Point start;
    private Point end;

    public Line(Point start, Point end) {
        this(start.getX(), start.getY(), end.getX(), end.getY());
    }

    public Line(final int startX, final int startY, final int endX, final int endY) {
        this.start = new Point(startX, startY);
        this.end = new Point(endX, endY);
    }

    public void setStart(Point start) {
        setStart(start.getX(), start.getY());
    }

    public void setEnd(Point end) {
        setEnd(end.getX(), end.getY());
    }

    public void setStart(final int x, final int y) {
        this.start.setX(x);
        this.start.setY(y);
    }

    public void setEnd(final int x, final int y) {
        this.end.setX(x);
        this.end.setY(y);
    }

    public Point getStart() {
        return new Point(start.getX(), start.getY());
    }

    public Point getEnd() {
        return new Point(end.getX(), end.getY());
    }
}
