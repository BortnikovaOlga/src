package ru.bortnikova.task3;
// дополнительное задание, переставить символы в строке в обратном порядке

import java.util.Scanner;

public class MyString {
    public static void main(String[] args) {
        String myString;

        System.out.println(" Введите любую строку :");
        Scanner in = new Scanner(System.in);
        myString = in.nextLine();

        char[] myArray = new char[myString.length()];
        int i = myArray.length;

        for (char ch : myString.toCharArray()) {
            myArray[--i] = ch;
        }
        System.out.println("Перевернутая строка -->");
        System.out.println(myArray);
    }
}
