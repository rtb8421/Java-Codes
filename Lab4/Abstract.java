package Lab4;

public class Abstract {
    abstract class Accounts {
        protected double balance;
        protected int accountNumber;
        protected String accountHolderName;
        protected String address;

        // Abstract methods
        public abstract void withdraw(double amount);

        public abstract void deposit(double amount);

        // Method to display the balance of the accountNumber
        public void display() {
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Balance: " + balance);
        }
    }

    // Subclass SavingAccount
    class SavingAccount extends Accounts {
        private double rateOfInterest;

        // Constructor for SavingAccount
        public SavingAccount(int accountNumber, String accountHolderName, String address, double rateOfInterest) {
            this.accountNumber = accountNumber;
            this.accountHolderName = accountHolderName;
            this.address = address;
            this.rateOfInterest = rateOfInterest;
        }

        // Method to calculate the amount with interest
        public void calculateAmount() {
            balance += balance * rateOfInterest;
        }

        @Override
        public void withdraw(double amount) {

        }

        @Override
        public void deposit(double amount) {

        }

        // Override display() method to show interest and full account holder details
        @Override
        public void display() {
            super.display();
            System.out.println("Interest Rate: " + rateOfInterest);
            System.out.println("Account Holder Name: " + accountHolderName);
            System.out.println("Address: " + address);
        }
    }

    // Subclass CurrentAccount
    class CurrentAccount extends Accounts {
        private double
                overdraftLimit;

        // Constructor for CurrentAccount
        public CurrentAccount(int accountNumber, String accountHolderName, String address, double overdraftLimit) {
            this.accountNumber = accountNumber;
            this.accountHolderName = accountHolderName;
            this.address = address;
            this.overdraftLimit = overdraftLimit;
        }

        @Override
        public void withdraw(double amount) {

        }

        @Override
        public void deposit(double amount) {

        }

        // Override display() method to show overdraft limit and full account holder details
        @Override
        public void display() {
            super.display();
            System.out.println("Overdraft Limit: " + overdraftLimit);
            System.out.println("Account Holder Name: " + accountHolderName);
            System.out.println("Address: " + address);
        }
    }

    // Create objects of the two classes and call their methods
    public class Main {
        public void main(String[] args) {
            // Creating a SavingAccount object
            SavingAccount savingAccount = new SavingAccount(12345, "John Doe", "123 Main St", 0.05);
            savingAccount.deposit(1000);
            savingAccount.calculateAmount();
            savingAccount.display();

            // Creating a CurrentAccount object
            CurrentAccount currentAccount = new CurrentAccount(54321, "Jane Smith", "456 Park Ave", 5000);
            currentAccount.deposit(500);
            currentAccount.display();
        }
    }
}
