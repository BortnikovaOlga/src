package ru.bortnikova.task9;

public class Horse extends Animal implements Run, Swim {
    private String name;

    Horse() {
        name = "Лошадь";
    }

    Horse(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    public void run() {
        System.out.println("Я бегаю галопом, рысью");
    }

    public void swim() {
        System.out.println("Я могу переплыть реку и небольшое озеро");
    }

}