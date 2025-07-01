package ex11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe os dados da conta");
        System.out.println("Numero:");
        int number = sc.nextInt();

        sc.nextLine();

        System.out.println("Titular");
        String holder = sc.nextLine();

        System.out.println("Saldo inicial");
        double balance = sc.nextDouble();

        System.out.println("Limite");
        double WithDrawLimit = sc.nextDouble();

        Account acc = new Account(number, holder, balance, WithDrawLimit);

        System.out.println();
        System.out.print("Informe a quantia a ser sacada: ");
        double amount = sc.nextDouble();

        try {
            acc.withDraw(amount);
            System.out.println("Novo saldo: " + Account.getBalance());
        } catch (BusinessException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
