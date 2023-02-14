//**********************************************************************************************************************
// Activity 12: Classes
// Name: Blaine Bailey
// Date of Submission: 2/14/2023
//**********************************************************************************************************************
// This is the BankAccount class that creates bank accounts with an account holder name, starting balance, and interest
// rate using the constructor. This class has methods for depositing money, withdrawing money, changing interest rate,
// and displaying bank account information
//**********************************************************************************************************************
public class BankAccount {
    //Initialize instance variables
    String accountHolder;
    double balance;
    double interest;

    //BankAccount constructor that creates a new bank account with an account holder name, starting balance, and interest rate
    public BankAccount(String name, double balance, double interest) {
        this.accountHolder = name;
        this.balance = balance;
        this.interest = interest;
    }

    //Adds money to the account
    public void deposit(double amount) {
        this.balance += amount;
    }

    //Takes money out of the account
    public void withdraw(double amount) {
        this.balance -= amount;
    }

    //Adds interest to the account
    public void addInterest() {
        this.balance *= (this.interest + 1);
    }

    //Changes the interest rate on the account
    public void changeRate(double newInterest) {
        this.interest = newInterest;
    }

    //Displays bank account information
    public void accessInformation() {
        System.out.printf("Account Holder's name is: %s\n", this.accountHolder);
        System.out.printf("%s's balance is: $%.2f\n", this.accountHolder, this.balance);
        System.out.printf("%s's interest rate is: %.2f%%\n", this.accountHolder, (this.interest*100));
    }
}