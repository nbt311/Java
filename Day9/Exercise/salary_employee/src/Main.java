package src;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ten nhan vien");
        String name = scanner.nextLine();
        System.out.println("Nhap ma so");
        String code = scanner.nextLine();
        System.out.println("Nhap so gio lam theo thang");
        int hour_per_month = scanner.nextInt();
        System.out.println("Nhap muc luong co ban");
        int basic_money = scanner.nextInt();
        System.out.println("Nhap so gio lam them");
        int overtime_hour = scanner.nextInt();
        System.out.println("Nhap muc luong lam them");
        int overtime_money = scanner.nextInt();

        Employee employee = new Employee(name, code, hour_per_month, basic_money, overtime_hour, overtime_money);
        System.out.println(employee.toString());

    }
}
