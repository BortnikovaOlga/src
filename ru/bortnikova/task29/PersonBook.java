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

}


