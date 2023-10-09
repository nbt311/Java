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
        float acreage = (float) Math.sqrt(p*(p-a)*(p-b)*(p-c));
        if ( a == b && b == c){
            System.out.println("Day la tam giac deu");
            System.out.println("Chu vi = " + perimeter);
            System.out.println("Dien tich = " + acreage);
        } else if (a == b || b == c || c == a )  {
            System.out.println("Day la tam giac can");
            System.out.println("Chu vi = " + perimeter);
            System.out.println("Dien tich = " + acreage);
        } else if (a*a == b*b + c*c || b*b == a*a + c*c || c*c == a*a + b*b) {
            System.out.println("Day la tam giac vuong");
            System.out.println("Chu vi = " + perimeter);
            System.out.println("Dien tich = " + acreage);
        } else if ( (a + b > c) || (a + c > b) || ( b + c > a )) {
            System.out.println("Day la tam giac");
            System.out.println("Chu vi = " + perimeter);
            System.out.println("Dien tich = " + acreage);
        }else {
            System.out.println("Day khong phai tam giac");
        }
    }
    }

