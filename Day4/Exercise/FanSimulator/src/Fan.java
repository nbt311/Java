package src;

public class Fan {
    private final int SLOW = 1;
    private final int MEDIUM = 2;
    private final int FAST = 3;

    private int speed = 1 ;
    private boolean on = false;

    private double radius = 5;

    private String color = "blue";

    public int getSLOW() {
        return SLOW;
    }

    public int getMEDIUM() {
        return MEDIUM;
    }

    public int getFAST() {
        return FAST;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isOn() {
        return on;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public Fan(){
    }

    public Fan(int speed, double radius,String color ,boolean on) {
            this.speed = speed;
            this.radius = radius;
            this.color = color;
            this.on = on;
    }

    public String ShowMessage(){
        String message = " ";
        if (this.isOn()){
            message += "Fan is on \n" + "Speed: " + this.speed + "\n";
        }else{
            message += "Fan is off \n";
        }
         message += "Color: " + this.color;
        message += "Radius: " + this.radius;
        return  message;
    }
}
