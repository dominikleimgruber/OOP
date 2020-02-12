package ch.hslu.oop.mepprep.sw08;

public class Main {

    public static void main(String[] args) {

        Shape rect = new Rectangle(10, 10, 30, 5);
        Shape circle = new Circle(20, 20, 16);

        rect.move(40, 30);
        circle.move(10, 20);


        //Statischer Typ  ist jener der Referenzvariablen und der Dynamischer jener des Objekts
        if (circle instanceof Circle) {
            Circle circle2 = (Circle) circle;
            System.out.println(circle2.getDiameter());
        }
    }
}
