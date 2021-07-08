package com.company;

public class BankAccount {
    double balance;

    public double getAmount() {
        return balance;
    }

    public void deposit(double sum) {
        balance += sum;
    }

    public void withDraw(int sum) throws LimitException {
        if (sum > balance) {
            throw new LimitException("Запрашиваемая сумма больше чем остаток ", balance);
        }
        balance -= sum;
        System.out.println("Вывод " + sum);


    }
}
