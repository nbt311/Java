import src.Account;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Account a = new Account("Trung","abc.@gmail.com","01223455");
        System.out.println(a.getInfo());
        Scanner scanner = new Scanner(System.in);
        boolean check = true;
        do{
            System.out.println("0: Exit");
            System.out.println("1: Deposit to account");
            System.out.println("2: Withdraw from account");
            System.out.println("3: View currency money");

            int choseNumber = scanner.nextInt();

            switch (choseNumber){
                case 1:
                    System.out.println("Enter the money to deposit");
                    int amount = scanner.nextInt();
                    a.deposit(amount);
                    break;
                case 2:
                    System.out.println("Enter the money withdraw");
                    int amount1 = scanner.nextInt();
                    a.withDrawMoney(amount1);
                case 3:
                    int currencyMoney = a.getMoney();
                    System.out.println("Currency money of account: " + currencyMoney);
                case 0:
                    check = false;
            }
        }while (check);

    }
}
