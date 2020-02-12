package ch.hslu.oop.mepprep.sw08;

public final class Circle extends Shape {

    private int diameter;

    public Circle(int x, int y, int diameter) {
        super(x, y);
        this.diameter = diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public int getDiameter() {
        return diameter;
    }

    @Override
    public int getPerimeter() {
        return (int) Math.PI * diameter;
    }

    @Override
    public int getArea() {
        return (int) (Math.pow(diameter / 2, 2) * Math.PI);
    }
}
