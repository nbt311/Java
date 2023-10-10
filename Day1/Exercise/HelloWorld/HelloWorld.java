import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("----Hien thi loi chao----");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Xin moi nhap ten cua ban");
        String name = scanner.nextLine();
        System.out.println("Xin chao " + name);
    }
}
