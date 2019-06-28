package ru.bortnikova.task5;

// класс модель автомата продажи напитков

public class VendingMachine {

    private static int CANCELKEY = 99;
    private Drink[] allDrinks; //ассортимент автомата
    int pressKey; // выбор покупателя

    VendingMachine() {
        this.allDrinks = Drink.values();
    }


    // показывает меню, считывает выбор напитка
    public void start() {

        Console.showMenu(allDrinks);
        this.pressKey = Console.pressKey(allDrinks);

        if (Acceptor.getMoney(allDrinks[pressKey].getCost(), CANCELKEY)) {
            getDrink();
        }

    }

    // выдает напиток
    public void getDrink() {
        System.out.println("Пожалуйста,ваш " + this.allDrinks[pressKey].getNamed() + " готов");
    }
}
