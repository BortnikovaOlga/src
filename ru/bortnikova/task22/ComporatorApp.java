package ru.bortnikova.task22;

public class ComporatorApp {
    public static void main(String[] args) {
        Person p1 = new Person("Иван Иванович", 25);
        Person p2 = new Person("Иван Иванович", 50);
        Person p3 = new Person("Сергей Сергеевич", 25);
        System.out.println("Сравним " + p1.toString() + " и " + p2.toString());
        System.out.println("Результат " + p1.compareTo(p2));
        System.out.println("Сравним " + p3.toString() + " и " + p2.toString());
        System.out.println("Результат " + p3.compareTo(p2));
    }
}
