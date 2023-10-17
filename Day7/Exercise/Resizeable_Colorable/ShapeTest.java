import src.IColor.Colorable;
import src.Shape.Circle;
import src.Shape.Rectangle;
import src.Shape.Shape;
import src.Shape.Square;

public class ShapeTest {
    public static void main(String[] args) {
        double x = (double) Math.floor(Math.random() * 10);
       Shape[] shapes = new Shape[3];
       shapes[0] = new Circle(x);
       shapes[1] = new Rectangle(x,x);
       shapes[2] = new Square(x,"red",true);

        System.out.println("Before-resize:");
       for (Shape shape : shapes){
           System.out.println(shape);
       }
        System.out.println("After-resize:");
       for (Shape shape : shapes){
           shape.resize(Math.random() * 1000);
           System.out.println(shape);
       }
        System.out.println("How to color:");
        for (Shape shape : shapes){
            if (shape instanceof Colorable){
                shape.howToColor();
            }
        }
//        System.out.println("\n");
        //Shape.printShape(shapes);

    }
}
