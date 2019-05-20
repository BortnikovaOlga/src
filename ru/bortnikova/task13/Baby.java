package ru.bortnikova.task13;

public class Baby {

    public static void eat(Food food) throws BabyException {
        System.out.printf("малыш пробует  " + food.getnamed() + " : ");
        if (Math.random() < 0.4)
            throw new BabyException("Кака ! не буду !");
        else
            System.out.printf("Ням-Ням, вкусно !");
    }

    public static void say(String message){
        System.out.println(message);
    }

    public static void say(BabyException e){
        System.out.printf(e.getMessage());
    }
}
