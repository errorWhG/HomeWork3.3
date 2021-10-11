package com.company;

public class Main {

    public static void main(String[] args) {

        BankAccount bot = new BankAccount();
        bot.deposit(20000);
        System.out.println(bot.getAmount());
        while (true) {
            try {
                bot.withDraw(6000);
            }catch (LimitException a){
                System.out.println(" У вас не достаточно стредств что бы снять эту сумму денег, снимите остаток денег");

                try {
                    bot.withDraw((int) bot.getAmount());
                }catch (LimitException i){
                    i.printStackTrace();
                }
                break;
            }
        }
    }
}
