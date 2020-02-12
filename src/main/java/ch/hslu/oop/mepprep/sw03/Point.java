package ch.hslu.oop.mepprep.sw03;

public final class Point {

    private int x;
    private int y;

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

    public int getQuadrant(){
        if(x >= 0 && y >= 0){
            return 1;
        }
        else if(x < 0 && y >= 0){
            return 2;
        }
        else if (x < 0 && y < 0){
            return 3;
        }
        else{
            return 4;
        }
    }
}
