import src.Shape.Circle;
import src.Shape.Rectangle;
import src.Shape.Shape;

public class ShapeTest {
    public static void main(String[] args) {
        double x = (double) Math.floor(Math.random() * 10);
       Shape[] shapes = new Shape[2];
       shapes[0] = new Circle(x);
       shapes[1] = new Rectangle(x,x);
        System.out.println("Before-resize:");
       for (Shape shape : shapes){
           System.out.println(shape);
       }
        System.out.println("After-resize:");
       for (Shape shape : shapes){
           shape.resize(Math.random() * 1000);
           System.out.println(shape);
       }
//        System.out.println("\n");
        //Shape.printShape(shapes);


    }
}
