package Week4;

import java.util.Scanner;

class Bankaccount {
    private String accountHolderName;
    // private long accountNumber;
    private String accountNumber;
    private double balance;

    public Bankaccount(String accountHolderName, String accountNumber, double balance) {

        // if (accountNumber < 0 || accountNumber > 9999999999L){
        if (accountNumber.matches("\\d+") && accountNumber.length() == 10) {
            this.accountNumber = accountNumber;
        } else {
            this.accountNumber = "Invalid";
            System.out.println("Error: Account Number must be a positive and 10 digits.");
        }

        this.accountHolderName = accountHolderName;

        this.balance = (balance >= 0) ? balance : 0;

    }

    public void DisplayBalance() {
        if (balance >= 0) {
            System.out.println("Your current balance is: " + balance);

        } else {
            System.out.println("Error: Balance cannot be negative.");
        }
    }

    public void deposit(double amount) {

        if (accountNumber.equals("Invalid")) {
            System.out.println("Error: Cannot perform transactions on an account with invalid account number.");
            return;
        }

        if (amount > 0) {
            balance += amount;
            System.out.println("Your deposit has been successful.New balance is: " + balance);
        } else {
            System.out.println("Error:Deposit amount cannot be negative.");
        }
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful.New balance is: " + balance);

        } else {
            System.out.println("Error:Insufficient balance for withdrawal.");
        }
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void displayAccountInfo() {
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: " + balance);
    }
}

public class BankBalance {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Account Holder Name: ");
        String name = sc.nextLine();

        System.out.println("Enter Account Number: ");
        String accNumber = sc.nextLine();

        System.out.println("Enter Initial Balance: ");
        double initialBalance = sc.nextDouble();

        Bankaccount account = new Bankaccount(name, accNumber, initialBalance);
        account.displayAccountInfo();

        System.out.println("Enter amount to deposit: ");
        double depositAmount = sc.nextDouble();
        account.deposit(depositAmount);

        System.out.println("Enter amount to withdraw: ");
        double withdrawAmount = sc.nextDouble();
        account.withdraw(withdrawAmount);

        account.displayAccountInfo();

        sc.close();

    }

}
