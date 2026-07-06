interface Bank {
    void deposit(double amount);
    void withdraw(double amount);
    void checkBalance();
}
class Account implements Bank {
    private double balance = 1000;

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: Rs." + amount);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: Rs." + amount);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    public void checkBalance() {
        System.out.println("Current Balance: Rs." + balance);
    }
}
public class BankInterfaceDemo {
    public static void main(String[] args) {

        Account acc = new Account();

        System.out.println("Initial Account Details");
        acc.checkBalance();

        System.out.println("\nDepositing Money...");
        acc.deposit(500);

        System.out.println("\nWithdrawing Money...");
        acc.withdraw(100);

        System.out.println("\nChecking Balance...");
        acc.checkBalance();

        System.out.println("\nTrying to Withdraw More Than Balance...");
        acc.withdraw(3000);

        System.out.println("\nFinal Balance...");
        acc.checkBalance();
    }
}