package ru.bortnikova.task29;

import java.util.*;

public class PersonBook {
    Map<String, Person> book;

    PersonBook() {
        book = new HashMap<String, Person>();
    }

    public void put(String key, Person person) {
        book.put(key, person);
    }


    @Override
    public String toString() {
        return "PersonBook{" +
                "book=" + book +
                '}';
    }

    public void removeByValue(Person person) {
        Map<String, Person> copy = new HashMap<>(book);
        for (Map.Entry<String, Person> pair : copy.entrySet()) {
            if (pair.getValue().equals(person))
                book.remove(pair.getKey());
        }
    }

    public void removeTheDuplicates() {
        Map<String, Person> copy = new HashMap<>(book);
        Set<Person> forDel = new HashSet<>();

        for (Map.Entry<String, Person> pair : copy.entrySet()) {
            Person person = pair.getValue();
            if (forDel.contains(person) && book.containsValue(person)) {
                removeByValue(person);
            } else forDel.add(person);
        }
    }

    public void removeDuplicates() {
        Set<Person> personsForDel = new HashSet<>();
        Set<Person> allPersons = new HashSet<>();

        for (Map.Entry<String, Person> pair : book.entrySet()) {
            Person person = pair.getValue();
            if (!allPersons.add(person))
                personsForDel.add(person);
        }
        book.values().removeAll(personsForDel);
        // ... и тут я выяснила, что removeAll - удаляет не просто по одному элементу
        // для заданного сета, какой первый попадется, а действительно All )))
    }

}


