abstract class BankAccount {
    private int accountNumber;
    private String accountHolderName;
    private double balance;
    public BankAccount(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }
    public int getAccountNumber() {
        return accountNumber;
    }
    public String getAccountHolderName() {
        return accountHolderName;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Amount Deposited: " + amount);
    }
    public void displayDetails() {
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account Holder : " + accountHolderName);
        System.out.println("Balance        : " + balance);
    }
    public abstract double calculateInterest();
}
class SavingsAccount extends BankAccount {

    public SavingsAccount(int accountNumber, String accountHolderName, double balance) {
        super(accountNumber, accountHolderName, balance);
    }
    @Override
    public double calculateInterest() {
        return getBalance() * 0.05;
    }
}
class CurrentAccount extends BankAccount {
    public CurrentAccount(int accountNumber, String accountHolderName, double balance) {
        super(accountNumber, accountHolderName, balance);
    }
    @Override
    public double calculateInterest() {
        return getBalance() * 0.03;
    }
}
public class Exp10 {

    public static void main(String[] args) {


        SavingsAccount sa = new SavingsAccount(
                101,
                "SATYAM",
                10000);


        CurrentAccount ca = new CurrentAccount(
                201,
                "ARYAN",
                15000);


        sa.deposit(2000);
        ca.deposit(3000);


        System.out.println("\n----- Savings Account -----");
        sa.displayDetails();
        System.out.println("Interest: " + sa.calculateInterest());


        System.out.println("\n----- Current Account -----");
        ca.displayDetails();
        System.out.println("Interest: " + ca.calculateInterest());
    }
}