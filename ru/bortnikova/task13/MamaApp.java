package ru.bortnikova.task13;

public class MamaApp {

    public static void main(String[] args) {


        for (Food food : Food.values()) {
            MamaApp.feedBaby(food);

        }
    }

    static void feedBaby(Food food) {
        try {
            Baby.eat(food);
        } catch (BabyException e) {
            System.out.println(e.getMessage());
        }
    }
}

