package src;

public class Triangle extends Shape {
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;

    public Triangle(){};

    public Triangle(double side1, double side2, double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    public Triangle(double side1, double side2, double side3,String color, boolean filled){
        super(color,filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public boolean isValid() {
        if (((side1 + side2) > side3) ||
                ((side1 + side3) > side2) ||
                ((side3 + side2) > side1)) {
            return true;
        }
        return false;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getPerimeter(){
        return getaPerimeter();
    }

    private double getaPerimeter() {
        return this.side1 + this.side2 + this.side3;
    }

    public double getArea(){
        double p = getP();
        return  Math.sqrt(p*(p-getSide1())*(p-getSide2())*(p-getSide3()));
    }

    private double getP() {
        return getPerimeter() / 2;
    }

    public String toString(){
        if (!isValid()){
            return "Khong phai la 1 tam giac";
        }
        return "Triagle:\n" +
                "+ size of three side: " +
                this.side1 + ", " +
                this.side2 + ", " +
                this.side3 + "\n" +
                "+ color: " + this.getColor() + "\n" +
                "+ fill: " + this.isFilled() + "\n" +
                "+ Perimeter: " + this.getPerimeter() + "\n" +
                "+ Area: " + this.getArea() + "\n";
    }


}

