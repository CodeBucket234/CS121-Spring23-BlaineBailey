public class BankAccount {
    String accountHolder;
    double balance;
    double interest;
    public BankAccount(String name, double balance, double interest) {
        this.accountHolder = name;
        this.balance = balance;
        this.interest = interest;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        this.balance -= amount;
    }

    public void addInterest() {
        this.balance *= (interest + 1);
    }

    public void changeRate(double newInterest) {
        this.interest = newInterest;
    }

    public void accessInformation() {
        System.out.printf("Account Holder's name is: %s\n", this.accountHolder);
        System.out.printf("%s's balance is: $%.2f\n", this.accountHolder, this.balance);
        System.out.printf("%s's interest rate is: %.2f%%\n", this.accountHolder, (this.interest*100));
    }
}