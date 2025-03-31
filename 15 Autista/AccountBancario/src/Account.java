public class Account {
    private double balance;
    private String accountNumber;

    public Account(double balance, String accountNumber) {
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposito: " + amount + " Nuovo saldo: " + balance);
        }else {
            System.out.println("Importo non valido");
        }
    }
    public void withdraw(double amount) {
        if (amount > balance) {
            balance -= amount;
        }else {
            System.out.println("Importo non valido");
        }
    }
}
