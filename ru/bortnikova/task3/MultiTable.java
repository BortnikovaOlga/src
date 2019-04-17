package ru.bortnikova.task3;

// задание (3) вывод таблицы умножения на экран
public class MultiTable {
    public static void main(String[] args) {

        for (int i = 1; i < 10; i++) {

            for (int j = 1; j <= 10; j++) {

                System.out.printf(j + " x " + i + " = " + i * j + (i * j >= 10 ? "    " : "     "));
            }
            System.out.println("");
        }
        for (int j = 1; j <= 10; j++) {
            System.out.printf(j + " x 10 =" + 10 * j + "    ");
        }
    }
}
