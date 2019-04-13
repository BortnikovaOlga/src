package ru.bortnikova.task2;
// переводит число в секундах в часы, минуты, секунды.

import java.util.Scanner;

public class SecondsToHour {
    public static void main(String[] args) {
        int seconds = 72885, minutes = 0, hours = 0;

        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество секунд ");
        seconds = in.nextInt();

        System.out.println(seconds + " секунд равно ");
        if (seconds > 3600) {
            hours = seconds / 3600;
            seconds %= 3600;
        }
        if (seconds > 60) {
            minutes = seconds / 60;
            seconds %= 60;
        }
        System.out.println(hours + " часов " + minutes + " минут " + seconds + " секунд");
    }
}
