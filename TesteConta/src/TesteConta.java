class ContaCorrente {
    private String titular;
    private double saldo;
    private double taxaSaque = 0.005; // 0,5%


    public ContaCorrente(String titular, double saldo) {
        this.titular = titular; // para acessar atributo = this. ;
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.printf("Depósito de R$ %.2f realizado. Saldo atual: R$ %.2f\n", valor, saldo);
        } else {
            System.out.println("Valor inválido para depósito.");
        }
    }

    public void sacar(double valor) {
        double taxa = valor * taxaSaque;
        double totalSaque = valor + taxa;
        if (totalSaque <= saldo) {
            saldo -= totalSaque;
            System.out.printf("Saque de R$ %.2f realizado com taxa de R$ %.2f. Saldo atual: R$ %.2f\n", valor, taxa, saldo);
        } else {
            System.out.println("Saldo insuficiente para saque.");
        }
    }

    public double obterSaldo() {
        return saldo;
    }
}

class ContaCorrenteEspecial extends ContaCorrente {
    public ContaCorrenteEspecial(String titular, double saldo) {
        super(titular, saldo);
    }

    @Override
    public void sacar(double valor) {
        double taxa = valor * 0.001; // 0,1%
        double totalSaque = valor + taxa;
        if (totalSaque <= obterSaldo()) {
            super.sacar(valor - (valor * 0.004)); // Ajuste para taxa reduzida
        } else {
            System.out.println("Saldo insuficiente para saque.");
        }
    }
}
