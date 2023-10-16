package src;

public class Main {
    public static void main(String[] args) {
        Point point = new Point(3,5);
        System.out.println(point);
        MovablePoint movablePoint = new MovablePoint(3,4,5,6);
        System.out.println(movablePoint);
        System.out.println(movablePoint.move());
    }
}
