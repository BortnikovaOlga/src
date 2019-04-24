package ru.bortnikova.task5;

import java.util.Scanner;

// модель автомата продажи напитков
public class VendingMachine {

    private static int CANCELKEY = 99;
    private Drink choiceDrink; // поле, в которое сохраняем выбранный напиток
    private int putMoney;      // поле, в которое сохраняем сумму внесенных в автомат денег

    public enum Drink {
        ESPRESSO("Эспрессо", 50),
        CAPPUCCINO("Каппучино", 60),
        AMERICANO("Американо", 50),
        LATTE("Латте", 70),
        VIENNACOFFEE("Венский кофе", 70),
        MACCHIATO("Маккиато", 60),
        GLACE("Гляссе", 80),
        ROMANO("Романо", 50),
        BLACKTEA("Черный чай", 30),
        GREENTEA("Зеленый чай", 30);

        private String named;
        private int cost;

        Drink(String named, int cost) {
            this.named = named;
            this.cost = cost;
        }

    }

    VendingMachine() {
        this(0);
    }

    VendingMachine(int money) {
        this.putMoney = money;
    }


    // считывает выбор напитка
    public void pressKey() {

        int key = 0;
        Drink[] allDrink = Drink.values();
        System.out.println("--------------------------------------------------------");
        for (Drink drink : allDrink) {
            System.out.println((key++) + " " + drink.named + " Цена " + drink.cost + " рублей");
        }

        System.out.println("Нажмите кнопку для выбора напитка");
        Scanner in = new Scanner(System.in);

        while (true) {
            key = in.nextInt();
            if (key < 0 | key > allDrink.length) {
                System.out.println("Такого напитка нет");
                continue;
            } else {
                this.choiceDrink = allDrink[key];
                break;
            }
        }

    }

    // внос денег за выбранный напиток
    public void putMoney() {

        if (null == this.choiceDrink) {
            System.out.println("не выбран напиток !");
            return;
        }

        Scanner in = new Scanner(System.in);
        int money;

        while (true) {
            System.out.println("Вставьте купюру или монеты, " + CANCELKEY + " - отмена");
            money = in.nextInt();
            if (money == CANCELKEY) {
                this.choiceDrink = null;
                break;
            }
            this.putMoney += money > 0 ? money : -money;
            if (this.putMoney < this.choiceDrink.cost) {
                System.out.println("недостаточно денег");
            } else break;
        }
    }

    // выдает напиток и сдачу
    public void getDrink() {

        if (null == this.choiceDrink) {
            System.out.println("Отмена !");
            if (this.putMoney != 0) {
                System.out.println("Заберите деньги " + this.putMoney + " рублей");
                this.putMoney = 0;
            }
            return;
        }
        System.out.println("Пожалуйста,ваш " + this.choiceDrink.named + " готов");
        System.out.println("Сдача " + (this.putMoney - this.choiceDrink.cost) + " рублей");
        this.putMoney = 0;

    }
}
