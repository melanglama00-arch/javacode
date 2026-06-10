abstract class ATM {

    // Abstract methods (what the ATM can do)
    abstract void checkBalance();
    abstract void deposit(double amount);
    abstract void withdraw(double amount);
}

class BankATM extends ATM {

    private double balance = 10000; // hidden data

    @Override
    void checkBalance() {
        System.out.println("Current Balance: Rs. " + balance);
    }

    @Override
    void deposit(double amount) {
        balance += amount;
        System.out.println("Rs. " + amount + " deposited successfully.");
    }

    @Override
    void withdraw(double amount) {

        if (amount <= balance) {
            balance -= amount;
            System.out.println("Please collect your cash: Rs. " + amount);
        } else {
            System.out.println("Insufficient balance.");
        }
    }
}

public class Main {

    public static void main(String[] args) {

        BankATM user = new BankATM();

        user.checkBalance();

        user.deposit(5000);

        user.withdraw(3000);

        user.checkBalance();
    }
}