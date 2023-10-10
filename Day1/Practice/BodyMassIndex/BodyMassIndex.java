import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("----Tinh chi so can nang----");
        System.out.println("Nhap can nang");
        double weight = scanner.nextDouble();
        System.out.println("Nhap chieu cao");
        double height = scanner.nextDouble();
        System.out.println(checkBmi(weight,height));

    }

    public static String checkBmi(double weight, double height) {
        String message;
        double bmi = weight/Math.pow(height,2);
        if (bmi < 18.5){
            message = "Underweight";
        } else if (bmi < 25.0) {
            message = "Normal";
        } else if (bmi < 30.0){
            message = "Overweight";
        }else{
            message = "Obese";
        }
        return message;
    }
}
