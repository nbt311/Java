import java.util.Scanner;

public class ExchangeMoney {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("----Chuyen doi USD sang VND----");
        System.out.println("Nhap so tien USD");
        float money = scanner.nextFloat();
        double exchange = (double) money * 23000;
        System.out.println(money + "USD" + " = " + exchange + "VND");
    }
}
