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
        System.out.printf("%b\n", isUnique2(map));

        map.put("Иван", "Петров");
        map.put("Матвей", "Петров");

        System.out.println(map.toString());
        System.out.printf("%b\n", isUnique2(map));


        System.out.println(countValues(map).toString());
    }

    public static boolean isUnique(Map<String, String> map) {
        if (map.size() < 2) return true;
        Set<String> set = new HashSet(map.values());
        return (map.size() == set.size());
        // если их размер не совпадает, значит есть повторы
    }

    public static boolean isUnique2(Map<String, String> map) {
        if (map.size() < 2) return true;
        Collection<String> collection = map.values();
        Iterator<String> it = collection.iterator();
        // создаю множество, в которое буду добавлять values из map, пока не всретится дубль
        Set<String> valSet = new HashSet<String>();
        while (it.hasNext()) {
            String str = it.next();
            if (valSet.contains(str)) return false;
            valSet.add(str);
        }
        return true;
    }

    public static Map<String, Integer> countValues(Map<String, String> map) {
        Collection<String> collection = map.values();
        Iterator<String> it = collection.iterator();
        Map<String, Integer> countVal=new HashMap<String, Integer>();
        while (it.hasNext()) {
            String str = it.next();
            if (!countVal.containsKey(str)) countVal.put(str,1);
            else countVal.put(str,countVal.get(str)+1);
        }
        return countVal;
    }
}
