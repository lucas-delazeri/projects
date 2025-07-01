import java.util.Scanner;

class TesteConta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do titular da conta comum: ");
        String titular1 = scanner.nextLine();

        System.out.print("Digite o saldo inicial: ");
        double saldo1 = scanner.nextDouble();

        ContaCorrente conta1 = new ContaCorrente(titular1, saldo1);

        System.out.print("Digite o valor para depósito: ");
        double deposito1 = scanner.nextDouble();

        conta1.depositar(deposito1);

        System.out.print("Digite o valor para saque: ");
        double saque1 = scanner.nextDouble();

        conta1.sacar(saque1);

        System.out.printf("Saldo final de %s: R$ %.2f\n\n", titular1, conta1.obterSaldo());

        scanner.nextLine();

        System.out.print("Digite o nome do titular da conta especial: ");
        String titular2 = scanner.nextLine();

        System.out.print("Digite o saldo inicial: ");

        double saldo2 = scanner.nextDouble();

        ContaCorrenteEspecial conta2 = new ContaCorrenteEspecial(titular2, saldo2);

        System.out.print("Digite o valor para depósito: ");
        double deposito2 = scanner.nextDouble();

        conta2.depositar(deposito2);

        System.out.print("Digite o valor para saque: ");
        double saque2 = scanner.nextDouble();

        conta2.sacar(saque2);

        System.out.printf("Saldo final de %s: R$ %.2f\n", titular2, conta2.obterSaldo());

        scanner.close();
    }
}
