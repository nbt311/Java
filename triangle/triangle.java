
import java.util.Scanner;
public class triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Phan loai tam giac");
        System.out.println("In ra chu vi, dien tich");
        System.out.println("Nhap gia canh a: ");
        float a = scanner.nextFloat();
        System.out.println("Nhap gia canh b: ");
        float b = scanner.nextFloat();
        System.out.println("Nhap gia canh c: ");
        float c = scanner.nextFloat();
        if (isaTriangle(a, b, c)) {
            if (isaEquilateralTriangle(a, b, c)){
                System.out.println("Tam giac deu");
            } else if (isaIsoscelesTriangle(a, b, c)) {
                System.out.println("Tam giac can");
            } else if (isaRightTriangle(a, b, c)) {
                System.out.println("Tam giac vuong");
            }else {
                System.out.println("Tam giac thuong");
            }
            float perimeter = getPerimeter(a, b, c);
            double area = getArea(a, b, c);
            System.out.println("Chu vi: " + perimeter);
            System.out.println("Dien tich: " + area);
        } else {
            System.out.println("Đây không phải tam giác");
        }
    }

    public static float getPerimeter(float a, float b, float c){
        return a + b +c;
    }

    public static double getArea(float a, float b, float c){
        double p = (double) getPerimeter(a, b, c)/2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }

    private static boolean isaRightTriangle(float a, float b, float c) {
        return (a * a == b * b + c * c) ||
                (b * b == a * a + c * c) ||
                (c * c == a * a + b * b);
    }

    private static boolean isaIsoscelesTriangle(float a, float b, float c) {
        return a == b || a == c || b == c;
    }

    private static boolean isaEquilateralTriangle(float a, float b, float c) {
        return a == b && b == c;
    }

    private static boolean isaTriangle(float a, float b, float c) {
        return a + b > c && a + c > b && b + c > a &&
                a > 0 && b > 0 && c > 0;
    }
}

