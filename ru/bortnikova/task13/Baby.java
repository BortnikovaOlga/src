package ru.bortnikova.task13;

public class Baby {

    public static void eat(Food food) throws BabyException {
        System.out.printf("малыш пробует  " + food.getnamed() + " : ");
        if (Math.random() < 0.4)
            throw new BabyException("Кака ! не буду ! Спасибо !");
        else
            say("Ням-Ням, вкусно ! Спасибо !");
    }

    public static void say(String message){
        System.out.println(message);
    }

}
