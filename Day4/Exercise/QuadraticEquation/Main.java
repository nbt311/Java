import src.QuadraticEquation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap gia tri cua a");
        double a = scanner.nextDouble();
        System.out.println("Nhap gia tri cua b");
        double b = scanner.nextDouble();
        System.out.println("Nhap gia tri cua c");
        double c = scanner.nextDouble();

        QuadraticEquation solver = new QuadraticEquation(a,b,c);

        System.out.println(solver.SolveEquation());
    }
}
