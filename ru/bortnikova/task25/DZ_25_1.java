package ru.bortnikova.task25;

import java.util.*;


public class DZ_25_1 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("Вася", "Иванов");
        map.put("Петр", "Петров");
        map.put("Виктор", "Сидоров");
        map.put("Сергей", "Савельев");
        map.put("Вадим", "Викторов");
        System.out.println(map.toString());
        System.out.printf("%b\n", isUnique(map));
        map.put("Иван", "Петров");
        System.out.println(map.toString());
        System.out.printf("%b\n", isUnique(map));
    }

    public static boolean isUnique(Map<String, String> map) {
        if (map.size() < 2) return true;
        Collection<String> collection = map.values(); // в коллекцию попадают все value
        Set<String> set = new HashSet(collection);// а в set только разые элементы
        return (collection.size() == set.size());// если их размер не совпадает, значит есть повторы
    }
}
