package src;

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    public Circle(){

    }
    public Circle(double radius){
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.pow(getRadius(),2) * Math.PI;
    }
}
