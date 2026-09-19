package Mod4.task14;

public class Account {
    private int accNumber;
    private int balance;
    private String status;

    public Account(int accNumber, int balance) {
        this.accNumber = accNumber;
        this.balance = balance;
        this.status = "Active";
    }

    public int getAccNumber() {
        return accNumber;
    }

    public void setAccNumber(int accNumber) {
        this.accNumber = accNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void block() {
        this.status = "Blocked";
    }

    public void unblock() {
        this.status = "Active";
    }

    @Override
    public String toString() {
        return "Account{" +
                "accNumber=" + accNumber +
                ", balance=" + balance +
                ", status='" + status + '\'' +
                '}';
    }
}
