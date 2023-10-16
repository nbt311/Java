package src;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);
        Square square = new Square();
        System.out.println(square);
        circle = new Circle(3.5, "indigo", false);
        System.out.println(circle);

        rectangle = new Rectangle(2.3, 5.8,"orange", true);
        System.out.println(rectangle);

        square = new Square(5.8, "yellow", true);
        System.out.println(square);

    }
}
