package ru.bortnikova.task5;

import java.util.Scanner;

public class Acceptor {

    public static boolean getMoney(int total, int cancel) {
        Scanner in = new Scanner(System.in);
        int putMoney = 0, addMoney = 0;

        while (true) {
            System.out.println("Вставьте купюру или монеты, " + cancel + " - отмена");
            addMoney = in.nextInt();
            if (addMoney == cancel) {
                System.out.println("Отмена ! Заберите деньги " + putMoney + " рублей");
                return false;
            }
            putMoney += addMoney > 0 ? addMoney : -addMoney; // чтобы исключить отрицательные числа
            if (putMoney < total) {
                System.out.println("недостаточно денег");
                continue;
            }
            System.out.println("возьмите сдачу " + (putMoney - total) + " рублей");
            return true;

        }
    }
}
