package src;

public class TriangleClassify {

    public static String getTriangle(int side1,int side2,int side3){
        String message = "";
        if ( side1 + side2 > side3 && side2 + side3 > side1 && side1 + side3 > side2){
                message = "Is a Triangle";
                if ((side1 == side2 && side3 == side1)){
                    message = "Is a Equilateral Triangle";
               } else if (side1 == side2 || side1 == side3 || side2 == side3) {
                    message = "Is a Iosceles Triangle";
               }
        }else {
            message = "Is not Triangle";
        }
        return message;
    }
}
