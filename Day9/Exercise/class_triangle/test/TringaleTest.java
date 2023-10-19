package test;
import org.junit.Test;
import src.TriangleClassify;

import static org.junit.Assert.assertEquals;

public class TringaleTest {
    @Test
    public void testIsNotTringale()  {
        int side1 = 1;
        int side2 = 2;
        int side3 = 3;
        String expected = "Is not Triangle";
        String actual = TriangleClassify.getTriangle(side1,side2,side3);
        assertEquals(expected,actual);
    }
    @Test
    public void testIsaTringale() {
        int side1 = 3;
        int side2 = 2;
        int side3 = 4;
        String expected = "Is a Triangle";
        String actual = TriangleClassify.getTriangle(side1,side2,side3);
        assertEquals(expected,actual);
    }
    @Test
    public void testIsIsoscelesTriangle(){
        int side1 = 3;
        int side2 = 3;
        int side3 = 2;
        String expected = "Is a Iosceles Triangle";
        String actual = TriangleClassify.getTriangle(side1,side2,side3);
        assertEquals(expected,actual);
    }
    @Test
    public void testIsEquilateralTriangle(){
        int side1 = 3;
        int side2 = 3;
        int side3 = 3;
        String expected = "Is a Equilateral Triangle";
        String actual = TriangleClassify.getTriangle(side1,side2,side3);
        assertEquals(expected,actual);
    }


}
