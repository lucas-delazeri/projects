package ex11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter account details");
        System.out.println("Number: ");
        int number = sc.nextInt();

        sc.nextLine();

        System.out.println("Holder");
        String holder = sc.nextLine();

        System.out.println("Opening balance");
        double balance = sc.nextDouble();

        System.out.println("Limit");
        double WithDrawLimit = sc.nextDouble();

        Account acc = new Account(number, holder, balance, WithDrawLimit);

        System.out.println();
        System.out.print("Enter the amount to be withdrawn:");
        double amount = sc.nextDouble();

        try {
            acc.withDraw(amount);
            System.out.println("New balance: " + Account.getBalance());
        } catch (BusinessException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
