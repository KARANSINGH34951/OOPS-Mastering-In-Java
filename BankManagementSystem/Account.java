package BankManagementSystem;

public class Account {
    private int AccounNo;
    private String Name;
    private int Balance;

    public Account(int accounNo, String name, int balance) {
        AccounNo = accounNo;
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
        System.out.println("Account Number: " + AccounNo);
        System.out.println("Balance: " + Balance);
    }

    public int getBalance() {
        return Balance;
    }

    public int getAccounNo() {
        return AccounNo;
    }

    public String getName() {
        return Name;
    }

    public void setBalance(int balance) {
        Balance = balance;
    }
}
