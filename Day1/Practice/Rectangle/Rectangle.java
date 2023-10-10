import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap chieu rong");
        float width = scanner.nextFloat();
        System.out.println("Nhap chieu cao");
        float height = scanner.nextFloat();
        float area = width * height;
        System.out.println("Area is: " + area);
    }
}
