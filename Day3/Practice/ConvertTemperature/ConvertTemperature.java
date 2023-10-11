import java.util.Scanner;

public class ConvertTemperature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("----Chuyen doi nhiet do----");
        double celsius,fahrenheit;
        int choice;
        do{
            System.out.println("Menu.");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice){
                case 1: {
                    System.out.println("Nhap do F");
                    fahrenheit = scanner.nextDouble();
                    System.out.println("Do F sang do C: " + fahrenheitToCelsius(fahrenheit));
                    break;
                }
                case 2: {
                    System.out.println("Nhap do C");
                    celsius = scanner.nextDouble();
                    System.out.println("Do C sang do F: " + celiusToFahrenheit(celsius));
                    break;
                }
                case 0:
                    System.exit(0);
            }
        }while (choice !=0);
    }


    public static double celiusToFahrenheit(double celsius) {
        double fahrenheit = (9.0 / 5) * celsius + 32;
        return fahrenheit;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }

}