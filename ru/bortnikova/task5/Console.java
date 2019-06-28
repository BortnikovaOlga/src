package ru.bortnikova.task5;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Console {
    private static final Logger logger = Logger.getLogger(Console.class.getName());

    public static void showMenu(Drink[] allDrinks) {
        int i = 0;
        for (Drink drink : allDrinks) {
            System.out.println((i++) + " " + drink.getNamed() + " Цена " + drink.getCost() + " рублей");
        }
    }


    public static int pressKey(Drink[] allDrinks) {
        System.out.println("Нажмите кнопку для выбора напитка");
        Scanner in = new Scanner(System.in);
        int key;
        while (true) {
            key = in.nextInt();
            try {
                Drink drink = allDrinks[key];
                System.out.println("Ваш выбор : " + drink.getNamed());
                return key;
            } catch (ArrayIndexOutOfBoundsException e) {
                logger.log(Level.WARNING, "Ошибка меню", e);
                System.out.println("Неверный код напитка, повторите выбор");
            }

        }
    }
}

