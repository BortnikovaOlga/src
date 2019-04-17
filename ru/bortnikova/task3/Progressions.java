package ru.bortnikova.task3;
// задание (4) вывод арифметической и геометрической прогресси ( с недробным знаменателем )

import java.util.Scanner;

public class Progressions {
    public static void main(String[] args) {
        int festMember, stepProgression, numMembers;
        long nextMember;
        Scanner in = new Scanner(System.in);

        System.out.println("Построим арифметическую прогрессию :");
        System.out.println("Введите первый член прогрессии");
        festMember = in.nextInt();
        System.out.println("Введите шаг прогрессии");
        stepProgression = in.nextInt();
        System.out.println("Введите количество членов прогрессии");
        numMembers = in.nextInt();
        for (int i = 1; i <= numMembers; i++) {
            System.out.printf(festMember + (i - 1) * stepProgression + " , ");
        }
        System.out.println("..........");
        System.out.println("--------------------------------------");

        System.out.println("Построим геометрическую прогрессию :");
        System.out.println("Введите первый член прогрессии");
        festMember = in.nextInt();
        System.out.println("Введите знаменатель прогрессии");
        stepProgression = in.nextInt();
        System.out.println("Введите количество членов прогрессии");
        numMembers = in.nextInt();
        nextMember = festMember;
        for (int i = 1; i <= numMembers; i++, nextMember *= stepProgression) {
            System.out.printf(nextMember + ", ");
        }
        System.out.println("..........");
    }
}

