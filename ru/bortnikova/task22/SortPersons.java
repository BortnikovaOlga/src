package ru.bortnikova.task22;

import java.util.Comparator;

public class SortPersons implements Comparator <Person> {
    public int compare(Person p1, Person p2){
        return p1.compareTo(p2);
    }
}
