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
// далее методы для операций с дробными числами

    public static FractNumber mult(FractNumber a, FractNumber b) {
        FractNumber c = new FractNumber(a.numerator * b.numerator, a.denominator * b.denominator);
        c.simplifyFract();
        return c;
    }

    public static FractNumber div(FractNumber a, FractNumber b) {
        FractNumber c = new FractNumber(a.numerator * b.denominator, a.denominator * b.numerator);
        c.simplifyFract();
        return c;
    }

    public static FractNumber add(FractNumber a, FractNumber b) {
        FractNumber c = new FractNumber(a.numerator * b.denominator + a.denominator * b.numerator,
                a.denominator * b.denominator);
        c.simplifyFract();
        return c;
    }

    public static FractNumber sub(FractNumber a, FractNumber b) {
        FractNumber c = new FractNumber(a.numerator * b.denominator - a.denominator * b.numerator,
                a.denominator * b.denominator);
        c.simplifyFract();
        return c;
    }

}

// класс для объектов - дробных чисел
class FractNumber {
    public Integer numerator;   // числитель
    public Integer denominator; // знаменатель

    FractNumber(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public void setFract(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public String toStr() {
        return numerator.toString() + "/" + denominator.toString();
    }

    // метод, упрощает дробное число
    public void simplifyFract() {

        int[] simpl = {2, 3, 5, 7, 11, 13, 17, 23, 31};
        boolean doSimp = true;

        while (doSimp) {
            doSimp = false;
            for (int i = 0; denominator > 1 && i < simpl.length; i++) {

                if (numerator % simpl[i] == 0 && denominator % simpl[i] == 0) {
                    numerator /= simpl[i];
                    denominator /= simpl[i];
                    doSimp = true;
                }

            }
        }
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


