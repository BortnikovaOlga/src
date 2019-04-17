package ru.bortnikova.task3;
//  задание (1) и (2)

import java.util.Scanner;

public class MyNumbers {
    public static void main(String[] args) {
        int num1, num2;

        Scanner in = new Scanner(System.in);

        //  задание (1) нахождение минимума двух чисел
        // пользователь вводит два числа
        System.out.println("Введите первое число");
        num1 = in.nextInt();
        System.out.println("Введите второе число");
        num2 = in.nextInt();
        //  сравним эти чисела
        System.out.println((num1 != num2) ? (num1 > num2) ? "Первое число больше" : "Второе число больше" : "Числа равны");

        // используем метод, возвращающий минимум
        System.out.println("минимум равен " + minAB(num1, num2));
        System.out.println("---------------------------------------");

        // задание (2) анализ введенных числел
        // анализируем уже введеные в (1) числа

        System.out.println("Подробный анализ для введенных чисел");

        // анализ первого числа, демонстрация конструкций if-else, switсh
        switch (positivNegativ(num1)) {
            case 1:
                System.out.printf(num1 + " Число положительное, ");
                break;
            case -1:
                System.out.printf(num1 + " Число отрицательное, ");
                break;
            default:
                System.out.printf(num1 + " Число нулевое,  ");
        }
        if (evenNumber(num1))
            System.out.println("четное");
        else
            System.out.println("нечетное");

        // для анализа второго числа используем отдельный метод
        describeNumber(num2);
    }


    // метод находит минимум из двух переданных ему чисел
    static int minAB(int a, int b) {
        return (a <= b) ? a : b;
    }

    // метод возвращет 1 для положительного числа, -1 для отрицательного, или 0, если число нулевое
    static int positivNegativ(int number) {
        return (number != 0) ? (number > 1) ? 1 : -1 : 0;
    }

    // метод возвращает true для четного числа
    static boolean evenNumber(int number) {
        return (number % 2 == 0);
    }

    // метод делает анализ числа, печать на экран
    static void describeNumber(int number) {
        System.out.printf("Число " + number + ((number != 0) ? (number > 1) ? " положительное, " : " отрицательное, "
                : " нулевое, "));
        System.out.println(number % 2 == 0 ? "четное" : "нечетное");
    }
}
