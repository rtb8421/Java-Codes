package Lab4;

abstract class Accounts {
    protected double balance;
    protected int accountNumber;
    protected String accountHolderName;
    protected String address;

    public Accounts(double balance, int accountNumber, String accountHolderName, String address) {
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.address = address;
    }

    public abstract void withdraw(double amount);

    public abstract void deposit(double amount);

    public void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Address: " + address);
        System.out.println("Balance: $" + balance);
    }
}

class SavingAccount extends Accounts {
    private double rateOfInterest;

    public SavingAccount(double balance, int accountNumber, String accountHolderName, String address, double rateOfInterest) {
        super(balance, accountNumber, accountHolderName, address);
        this.rateOfInterest = rateOfInterest;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful.");
        } else {
            System.out.println("Insufficient balance for withdrawal.");
        }
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit successful.");
    }

    public void calculateAmount() {
        double interest = balance * rateOfInterest / 100;
        balance += interest;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Rate of Interest: " + rateOfInterest + "%");
        calculateAmount();
        System.out.println("Balance with Interest: $" + balance);
    }
}

class CurrentAccount extends Accounts {
    private double overdraftLimit;

    public CurrentAccount(double balance, int accountNumber, String accountHolderName, String address, double overdraftLimit) {
        super(balance, accountNumber, accountHolderName, address);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance + overdraftLimit) {
            balance -= amount;
            System.out.println("Withdrawal successful.");
        } else {
            System.out.println("Withdrawal exceeds overdraft limit.");
        }
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit successful.");
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Overdraft Limit: $" + overdraftLimit);
    }
}

public class Main {
    public static void main(String[] args) {
        SavingAccount savingAccount = new SavingAccount(1000, 12345, "John Doe", "123 Main St", 5.0);
        savingAccount.deposit(500);
        savingAccount.withdraw(200);
        savingAccount.display();

        System.out.println();

        CurrentAccount currentAccount = new CurrentAccount(2000, 54321, "Jane Smith", "456 Elm St", 1000);
        currentAccount.deposit(800);
        currentAccount.withdraw(3000);
        currentAccount.display();
    }
}
