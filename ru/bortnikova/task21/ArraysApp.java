package ru.bortnikova.task21;

public class ArraysApp {

    public static void main(String[] args) {

        int[] mass = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

        System.out.println("Дан массив");
        printArray(mass);
        revers(mass);
        System.out.println("массив после реверсии");
        printArray(mass);
        toLeft(mass);
        System.out.println("массив после сдвига налево");
        printArray(mass);

    }

    static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf(" " + array[i]);
        }
        System.out.println("");
    }

    static void toLeft(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
        array[array.length - 1] = 0;
    }

    static void revers(int[] array) {
        int temp;
        for (int i = 0; i < array.length / 2; i++) {
            temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
    }

}

