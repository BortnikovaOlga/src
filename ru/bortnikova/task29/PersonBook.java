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
        Set<String> keysForDel = new HashSet<>();
        for (Map.Entry<String, Person> pair : book.entrySet()) {
            Person person = pair.getValue();
            if (!allPersons.add(person)) {
                keysForDel.add(pair.getKey());
                personsForDel.add(person);
            }
        }
        book.keySet().removeAll(keysForDel);
        // а теперь удалить те записи, которые не попали в keysForDel,
        // но значения Person лежат в personForDel
        book.values().removeAll(personsForDel);
    }

}


