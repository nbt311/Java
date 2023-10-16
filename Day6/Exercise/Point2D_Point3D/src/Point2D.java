package src;

import java.util.Arrays;

public class Point2D {
    private float x = 0.0f;
    private float y = 0.0f;

    public Point2D(){

    }

    public Point2D(float x, float y){
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float[]getXY(){
        float[] newXY = new float[2];
        newXY[0] = this.x;
        newXY[1] = this.y;
        return newXY;
    }

    public void setXY(float x, float y) {
        setX(x);
        setY(y);
    }

    public String toString() {
        return "(x,y)" + Arrays.toString(this.getXY());
    }
}
