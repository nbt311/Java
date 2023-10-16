package src;

public class Cylinder extends Circle{
    private double height;

    public  Cylinder(){
        super();
    };

    public Cylinder(double radius){
        super(radius);
    }
    public Cylinder(double radius, double height){
        super(radius);
        this.height = height;
    }

    public  Cylinder(double radius, double height, String color){
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public String toString() {
        return "Cylinder with color: " + getColor() + " with Height: " + getHeight()
                + " with radius: " + getRadius() + " Volume is: " + getVolume();
    }


    public double getVolume() {
        return this.getHeight() * super.getArea();
    }
}
