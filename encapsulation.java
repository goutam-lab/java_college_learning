public class encapsulation {
    public static void main(String[] args) {
        // Create a new bank account
        BankAccount account = new BankAccount("123456789", 1000.0);

        // Get the account number and balance
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Initial Balance: " + account.getBalance());

        // Deposit money
        account.deposit(500.0); // Outputs: Deposited: 500.0
        System.out.println("Balance after deposit: " + account.getBalance());

        // Withdraw money
        account.withdraw(200.0); // Outputs: Withdrawn: 200.0
        System.out.println("Balance after withdrawal: " + account.getBalance());

        // Attempt to withdraw more than the balance
        account.withdraw(2000.0); // Outputs: Invalid withdrawal amount.
    }


}
class BankAccount {
    // Private variables (like the money inside the piggy bank)
    private String accountNumber;
    private double balance;

    // Constructor to initialize the account
    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    // Getter for accountNumber (like looking at the account number on the piggy bank)
    public String getAccountNumber() {
        return accountNumber;
    }

    // Getter for balance (like checking the balance through a statement)
    public double getBalance() {
        return balance;
    }

    // Setter for balance with validation (like depositing money through the slot)
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Method to withdraw money (like taking money out through the bottom opening)
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }
}
