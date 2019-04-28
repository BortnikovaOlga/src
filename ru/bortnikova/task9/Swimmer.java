package ru.bortnikova.task9;

public class Swimmer extends Person{

    public Swimmer(String name) {
        super(name,"Спортивное плавание");
    }

    public void swim() {
        System.out.println("Спортивные виды плавания");
    }
}