package ru.bortnikova.task5;

import java.util.Scanner;

public class Console {


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
            if (key < 0 | key >= allDrinks.length) {
                System.out.println("Такого напитка нет");
                continue;
            } else {
                return key;
            }
        }
    }
}
