public class Main {
    public static void main(String[] args) {

        int check = 3330; //начальный счет
        int replenishment = 156; // сумма пополнения
        int bonus;

        if (replenishment >= 1000) {
            bonus = replenishment / 100;
        } else {
            bonus = 0;
        }
        int balance = check + replenishment + bonus; // итоговый баланс

        System.out.println(balance);
    }
}