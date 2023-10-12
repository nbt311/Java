import src.StopWatch;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StopWatch oclock = new StopWatch();
        oclock.start();

        System.out.println("End: 1");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        if (num == 1) {
            oclock.end();
            System.out.println("------" + oclock.getElapsedTime()/1000);
        }




    }
}
