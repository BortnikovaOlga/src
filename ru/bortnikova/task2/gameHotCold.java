package ru.bortnikova.task2;
/* Игра горячо-холодно. Вначале программа «загадывает» случайное число от 1 до 100.
Пользователь вводит с консоли число.
Программа говорит пользователю «горячо», если он приблизился к «загаданному» числу и «холодно»,
если введенное число дальше от загаданного, чем предыдущее, и позволяет ввести число еще раз.
Для первого ввода пользователя считаем предыдущим введенным числом 0.
Предусмотрена возможность выхода из игры до отгадывания числа.
 */

import java.util.Scanner;

public class gameHotCold {
    public static void main(String[] args) {
        int hiddenNumber, inpNum = 0, delta = 100, newdelta;

        hiddenNumber = (int) (100 * Math.random());
        Scanner in = new Scanner(System.in);
        System.out.println("Мы загадали число от 1 до 100, попробуйте угадать его (число 666 - конец игры)");

        while (true) {

            inpNum = in.nextInt();
            if (inpNum == 666) break;

            if (inpNum == hiddenNumber) {
                System.out.println("Ура, вы угадали число !!!");
                break;
            }

            if (inpNum > 100 | inpNum < 1) {
                System.out.println("Вводите числа больше 1, но меньше , либо равные 100");
                continue;
            }
            // вычисляем новое значение дельты от введенного числа до загаданного,
            // первоначальное значение максимально равно 100
            newdelta = Math.abs(hiddenNumber - inpNum);
            // если новое значение дельты не меньше предыдего, игрок приближается , говорим - Горячо, иначе - Холодно
            System.out.println((delta >= newdelta) ? "Горячо" : "Холодно");
            delta = newdelta;
            System.out.println("Введите число еще раз");

        }
    }
}


