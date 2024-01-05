package access;

public class BankAccount {
    private int balance; //데이터를 private로. 외부 접근을 막았다.

    public BankAccount() {
        balance = 0;
    }

    public void deposit(int amount) {
        if (isAmountValid(amount)) {
            balance += amount;
        } else {
            System.out.println("유효하지 않음");
        } 
    }

    public void withdraw(int amount) {
        if (isAmountValid(amount) && balance - amount >= 0) {
            balance -= amount;
        } else {
            System.out.println("유효하지 않음");
        } 
    }

    public int getBalance() {
        return  balance;
    }

    //내부에서만 쓸 것. private로 막음
    private boolean isAmountValid(int amount) {
        return amount > 0;
    }
}
