package ru.bortnikova.task13;

public class Baby {

    public static void eat(Food food) throws BabyException {
        System.out.printf("малыш пробует  " + food.getnamed() + " : ");
        if (Math.random() < 0.4)
            throw new BabyException("Кака ! не буду !");
        else
            System.out.printf("Ням-Ням, вкусно !");
    }

}
