package ru.bortnikova.task22;

import java.util.Arrays;

public class ComporatorApp {
    public static void main(String[] args) {
        Person persons[] = new Person[5];

        persons[0] = new Person("Сергей Сергеевич", 25);
        persons[1] = new Person("Иван Иванович", 50);
        persons[2] = new Person("Иван Иванович", 25);
        persons[3] = new Person("Антон Петрович", 29);
        persons[4] = new Person("Антон Борисович", 19);

        Arrays.sort(persons, new SortPersons());

        for (Person p : persons) {
            System.out.println(p.toString());
        }

    }
}
