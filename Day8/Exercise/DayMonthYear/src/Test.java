package src;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println("----Hien thi ngay tiep theo----");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ngay");
        int day = scanner.nextInt();
        System.out.println("Nhap thang");
        int month = scanner.nextInt();
        System.out.println("Nhap nam");
        int year = scanner.nextInt();
        NextDay newDay = new NextDay(day, month, year);
        System.out.println(newDay.showNextDay());

    }


}
