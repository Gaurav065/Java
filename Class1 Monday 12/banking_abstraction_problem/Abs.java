abstract class BankAccount {
    protected double balance;

    
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

 
    public abstract void deposit(double amount);

    public abstract void withdraw(double amount);

    public abstract double getBalance();
}


class SavingsAccount extends BankAccount {
    private double interestRate;

   
    public SavingsAccount(double initialBalance, double interestRate) {
        super(initialBalance);
        this.interestRate = interestRate;
    }

    
    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    
    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds for withdrawal.");
        }
    }

   
    @Override
    public double getBalance() {
        return balance;
    }

   
    public void calculateInterest() {
        double interest = balance * interestRate / 100;
        balance += interest;
    }
}


class CheckingAccount extends BankAccount {
    private double overdraftLimit;

   
    public CheckingAccount(double initialBalance, double overdraftLimit) {
        super(initialBalance);
        this.overdraftLimit = overdraftLimit;
    }

    
    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    
    @Override
    public void withdraw(double amount) {
        if (balance + overdraftLimit >= amount) {
            balance -= amount;
            if (balance < 0) {
                applyOverdraftFee();
            }
        } else {
            System.out.println("Insufficient funds for withdrawal.");
        }
    }

   
    @Override
    public double getBalance() {
        return balance;
    }

    // Method to apply overdraft fee
    private void applyOverdraftFee() {
        double overdraftFee = 20.0; // Example overdraft fee
        balance -= overdraftFee;
        System.out.println("Overdraft fee applied.");
    }
}

public class Abs {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount(1000, 2.5);
        CheckingAccount checkingAccount = new CheckingAccount(500, 100);

        // Perform operations on SavingsAccount
        savingsAccount.deposit(200);
        savingsAccount.calculateInterest();
        System.out.println("Savings Account Balance: " + savingsAccount.getBalance());

        // Perform operations on CheckingAccount
        checkingAccount.withdraw(600);
        System.out.println("Checking Account Balance: " + checkingAccount.getBalance());
    }
}