package ru.bortnikova.task13;

public class MamaApp {

    public static void main(String[] args) {


        for (Food food : Food.values()) {
            MamaApp.getEat(food);

        }
    }

    static void getEat(Food food) {
        try {
            Baby.eat(food);
        } catch (BabyException e) {
            System.out.printf(e.getMessage());
        } finally {
            System.out.println("спасибо !");
        }
    }
}

