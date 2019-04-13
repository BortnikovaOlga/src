package ru.bortnikova.task2;
// вычисляет сумму зарплаты на руки, сумму начислений вводит пользователь

import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        double accrued;
        double NDFL = 0.13;

        Scanner in = new Scanner(System.in);
        System.out.println("Введите сумму начисленной заработной платы ");
        accrued = in.nextDouble();

        System.out.println("к выдаче на руки " + accrued * (1 - NDFL) + " рублей");
    }
}
