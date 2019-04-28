package ru.bortnikova.task9;


public class homework9 {
    public static void main(String[] args) {

        Bat bat = new Bat("Летучая мышь Гигантская вечерница");
        Horse horse = new Horse();
        Penguin penguin = new Penguin();

        System.out.println(bat.getName()+">>>");
        bat.fly();

        System.out.println(horse.getName()+">>>");
        horse.run();
        horse.swim();

        System.out.println(penguin.getName()+">>>");
        penguin.swim();
        penguin.run();

        Person[] mans = new Person[3];

        mans[0] = new Runner("Иван");
        mans[1] = new Swimmer("Сергей");
        mans[2] = new CommonMan("Александр");

        for (int i = 0; i < mans.length; i++) {
            System.out.println(mans[i].getName()+">>>");
            mans[i].run();
            mans[i].swim();
        }

    }
}
