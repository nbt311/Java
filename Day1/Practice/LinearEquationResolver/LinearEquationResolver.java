import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("---Giai phuong trinh bac 1----");
        System.out.println("Nhap gia tri a");
        int a = scanner.nextInt();
        System.out.println("Nhap gia tri b");
        int b = scanner.nextInt();
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phuong trinh co vo so nghiem");
            }else {
                System.out.println("Phuong trinh vo nghiem");
            }
        }else {
            float x = (float) -b/a;
            System.out.println("Phuong trinh co nghiem x = " + x);
        }
    }
}
