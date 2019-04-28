package ru.bortnikova.task9;

public class Penguin extends Animal implements Swim, Run {
    private String name;

    Penguin() {
        name = "Пингвин";
    }

    Penguin(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    public void swim() {
        System.out.println("Я отлично плаваю, погружаюсь в воду, живу в океане");
    }

    public void run() {
        System.out.println("Я плохо бегаю");
    }
}