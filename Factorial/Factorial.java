import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Nhap so bat ky");
            int n = scanner.nextInt();
            if (n <= 0){
                System.out.println("So phai lon hon hoac bang 1");
            }else {
                long factorial = 1;
                for (int i = 2; i <= n; i++){
                    factorial *= i;
                }
                System.out.println("Giai thua cua " + n + " la " + factorial);
                break;
            }
        }while (true);
    }
}
