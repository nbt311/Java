import java.net.SocketOption;
import java.util.Scanner;
public class triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Phan loai tam giac");
        System.out.println("In ra chu vi, dien tich");
        System.out.println("Nhap gia tri a: ");
        float a = scanner.nextFloat();
        System.out.println("Nhap gia tri b: ");
        float b = scanner.nextFloat();
        System.out.println("Nhap gia tri c: ");
        float c = scanner.nextFloat();
        float perimeter = a + b + c;
        float p = perimeter/2;
        double acreage = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        if ((a + b > c) && (a + c > b) && (b + c > a) &&
                (a > 0) && (b > 0) && (c > 0)) {
            // Kiểm tra điều các tam giác đặc biệt
            if ((a == b) && (b == c)) {
                System.out.println("Tam giác đều!");
                System.out.println("Chu vi = " + perimeter);
                System.out.println("Dien tich = " + acreage);
            } else if ((a == b) || (a == c) || (b == c)) {
                System.out.println("Tam giác cân!");
                System.out.println("Chu vi = " + perimeter);
                System.out.println("Dien tich = " + acreage);
            } else if ((a * a == b * b + c * c) ||
                    (b * b == a * a + c * c) ||
                    (c * c == a * a + b * b)) {
                System.out.println("Tam giác vuông!");
                System.out.println("Chu vi = " + perimeter);
                System.out.println("Dien tich = " + acreage);
            } else {
                System.out.println("Tam giác thường!");
                System.out.println("Chu vi = " + perimeter);
                System.out.println("Dien tich = " + acreage);
            }
        } else {
            System.out.println("Đây không phải tam giác");
        }
    }
    }

