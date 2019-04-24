package ru.bortnikova.task5;
// домашняя работа 5, проектируем автомат по продаже напитков

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int key;
        VendingMachine machine = new VendingMachine();

        //while (true) {
        // можно зациклить, тогда после покупки будет выводиться новое предложение напитка
        machine.pressKey();
        machine.putMoney();
        machine.getDrink();
        //}
    }
}

