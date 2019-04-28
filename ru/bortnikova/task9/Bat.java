package ru.bortnikova.task9;

public class Bat extends Animal implements Fly {
    private String name;

    Bat() {
        name = "Летучая мышь";
    }

    Bat(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    public void fly() {
        System.out.println("Я охочусь в полете");
    }
}
