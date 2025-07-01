package ex11;

public class Account {
    int number;
    String holder;
    static double balance;
    static double WithDrawLimit; // limite do saque

    public static double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public static double getWithDrawLimit() {
        return WithDrawLimit;
    }
    public void setWithDrawLimit(double WithDrawLimit) {
        this.WithDrawLimit = WithDrawLimit;
    }

    public Account(int number, String holder, double balance, double WithDrawLimit){
        this.balance = balance;
        this.number = number;
        this.WithDrawLimit = WithDrawLimit;
    }
    public void deposit(double amount) {
        balance += amount;
    }
    public void withDraw(double amount) {
        validateWithdraw(amount);
        balance -= amount ;
    }

    public static void validateWithdraw(double amount) {
        if (amount > getWithDrawLimit()) {
            throw new BusinessException("Erro ao sacar: A quantia excede o limite de saque ");
        }
        if (amount > getBalance()) {
            throw new BusinessException("Erro ao sacar: Saldo insuficiente");
        }
    }

}
