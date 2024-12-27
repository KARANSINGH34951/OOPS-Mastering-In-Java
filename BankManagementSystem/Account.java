package BankManagement;

public class Account {
    private int AccountNo;
    private String Name;
    private int Balance;

    public Account(int accountNo, String name, int balance) {
        AccountNo = accountNo;
        Name = name;
        Balance = balance;
    }

    public void withdrawCash(int withdrawAmount) {
        if (withdrawAmount > Balance) {
            System.out.println("Insufficient Balance!");
        } else {
            Balance -= withdrawAmount;
            System.out.println("Withdrawal successful!");
            System.out.println("Withdrawn Amount: " + withdrawAmount);
        }
    }

    public void deposit(int depositAmount) {
        Balance += depositAmount;
        System.out.println("Deposit successful!");
    }

    public void BankStatement() {
        System.out.println("Account Holder Name: " + Name);
        System.out.println("Account Number: " + AccountNo);
        System.out.println("Balance: " + Balance);
    }

    public int getBalance() {
        return Balance;
    }

    public int getAccountNo() {
        return AccountNo;
    }

    public String getName() {
        return Name;
    }

    public void setBalance(int balance) {
        Balance = balance;
    }
}