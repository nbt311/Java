import java.util.Scanner;
public class ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Giai phuong tinh bac hai");
        System.out.println("Nhap gia tri a: ");
        float a = scanner.nextFloat();
        System.out.println("Nhap gia tri b: ");
        float b = scanner.nextFloat();
        System.out.println("Nhap gia tri c: ");
        float c = scanner.nextFloat();
        if (a == 0){
            showMessage(SolveFirstOrderEquations(b,c));
        }else {
            showMessage(SolveQuadraticEquations(a,b,c));
        }
    }

    public static void showMessage(String message) {
        System.out.println(message);
    }


    public static String SolveFirstOrderEquations(float a,float b){
        if (a == 0){
            if (b == 0){
                return "Phuong trinh vo so nghiem";
            }else {
                return "Phuong trinh vo nghiem";
            }
        }else {
            float result = -b/a;
            return "Phuong trinh co nghiem x = " + result;
        }
    }

    public static String SolveQuadraticEquations(float a,float b,float c){
        float delta = (float) (Math.pow(b,2) - 4*a*c);
        String message;
        if (delta < 0){
            message = "Phuong trinh vo nghiem";
        } else if (delta == 0) {
            float x = -b/(2*a);
            message = "Phuong trinh co nghiem kep x1=x2= " + x;
        }else{
            float x1 = (float) (-b + Math.sqrt(delta)/(2*a));
            float x2 = (float) (-b - Math.sqrt(delta)/(2*a));
            message = "Phuong trinh co 2 nghiem phan biet x1 = " + x1 + " x2 = " + x2;
        }
        return message;
    }
}
