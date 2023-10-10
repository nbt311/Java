import java.util.Scanner;

public class LeapYearCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("----Kiem tra nam nhuan-----");
        System.out.println("Nhap nam bat ky");
        int year = scanner.nextInt();
        System.out.println(leapYear(year));

    }

    public static String leapYear(int year) {
        String message;
        if (year % 4 == 0){
            if (year % 100 == 0){
                if (year % 400 == 0){
                    message = year + " la nam nhuan";
                }else {
                    message = year + " khong phai nam nhuan";
                }
            }else {
                message = year + " la nam nhuan";
            }
        }else {
            message = year + " khong phai nam nhuan";
        }
        return message;
    }
}
