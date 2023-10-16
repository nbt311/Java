package src;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();
        Square square = new Square();
        circle = new Circle(3.5, "indigo", false);
        System.out.println(circle);;

        rectangle = new Rectangle(2.3, 5.8,"orange", true);
        System.out.println(rectangle);

        square = new Square(5.8, "yellow", true);
        System.out.println(square);

    }
}
