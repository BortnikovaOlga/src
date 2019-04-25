package ru.bortnikova.task8;
// 1) Реализовать класс Calculator, который будет содержать статические методы для операций вычитания, сложения, умножения,
// деления и взятия процента от числа. Класс должен работать как с целыми числами, так и с дробными.

// 2)Реализовать класс в конструкторе которого будет счетчик количества создаваемых объектов.
// Написать метод для получения информации о количестве

// 1) класс Калькулятор, реализует сложение, вычитание, умножение, деление, процент от числа
public class Calculator {

    public static double add(double a, double b) {
        return a + b;
    }
    public static double sub(double a, double b) {
        return a - b;
    }

    public static double mult(double a, double b) {
        return a * b;
    }

    public static double div(double a, double b) {
        return a / b;
    }

    public static double percent(double a, double b) {
        return (a * b) / 100;
    }
}

// 2) класс, который подсчитывает количество созданных объектов своего класса
class CalcClass {
    private static int counterClass = 0;

    CalcClass() {
        counterClass++;
            }

    public static int getCounterClass() {
        return counterClass;
    }
}


