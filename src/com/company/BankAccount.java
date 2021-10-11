package com.company;

public class BankAccount {
    private double amount;

    public double getAmount() {
        return amount;
    }

    public void deposit(double sum) {
        amount = amount + sum;
    }

    public void withDraw(int sum) throws LimitException {
        if (sum > amount) {
            throw new LimitException("Вы не можете снять наличные, у вас не достаточно средств ", amount);
        } else {
            amount -= sum;
            System.out.println(" Ваш счёт:" + getAmount() + "\n" + "Минус: " + sum);
        }
    }
}
