import java.util.Scanner;

class ATM {
    private int pin = 1234;
    private double balance = 0;

    boolean checkPin(int enteredPin) {
        return enteredPin == pin;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit Successful");
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdraw Successful");
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    void checkBalance() {
        System.out.println("Available Balance : " + balance);
    }
}

public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ATM atm = new ATM();

        System.out.print("Enter ATM PIN: ");
        int pin = sc.nextInt();

        if (atm.checkPin(pin)) {
            System.out.print("Enter Deposit Amount: ");
            double deposit = sc.nextDouble();
            atm.deposit(deposit);

            System.out.print("Enter Withdraw Amount: ");
            double withdraw = sc.nextDouble();
            atm.withdraw(withdraw);

            atm.checkBalance();
        } else {
            System.out.println("Invalid PIN");
        }

        sc.close();
    }
}