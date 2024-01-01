package oop1.ex;

public class Account {
    int balance;

    void deposit(int amount) {
        balance += amount;
    }

    void withDrow(int amount) {
        if (balance < amount) {
            System.out.println("잔액 부족");
            System.out.println("잔고: " + balance);
            return;
        }
        balance -= amount;
    }
}
