package hardPracticeTask2;

public class BankAccount {
    private String owner;
    private double balance;

    public BankAccount(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    public String getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposite(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public void printBalance() {
        System.out.println("Текущий баланс равен: " + balance);
    }

    public static void main(String[] args) {

        BankAccount newAccount = new BankAccount("J.P.Morgan", 150.50);
        newAccount.deposite(50.0);
        newAccount.withdraw(0.50);
        newAccount.printBalance();
    }
}
