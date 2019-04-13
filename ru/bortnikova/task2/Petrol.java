package ru.bortnikova.task2;
// вычисляет сумму к оплате за заправленный бензин, количество литров и стоимость за литр топлива вводит пользователь

import java.util.Scanner;

public class Petrol {
    public static void main(String[] args) {
        int liters;
        double cost, total;

        Scanner in = new Scanner(System.in);
        System.out.println("Введите нужное количество литров");
        liters = in.nextInt();

        System.out.println("Введите цену бензина");
        cost = in.nextDouble();
        total = liters * cost;

        System.out.println("Вы заправились на " + total + " рублей");
    }
}
