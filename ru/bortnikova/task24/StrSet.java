package ru.bortnikova.task24;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class StrSet {

    /**
     * @param set множество строк разной длины
     * @return возвращает новое множество не содержащее строк четной длины,
     * исходное не изменяется
     */
    public static Set<String> removeEvenLength(Set<String> set) {

        Set<String> delSet = new HashSet<String>();
        Iterator<String> it = set.iterator();
        do {
            String str = it.next();
            if (str.length() % 2 != 0) delSet.add(str);
        } while (it.hasNext());
        return delSet;
    }

    /**
     * @param set множество строк разной длины
     *            удаляет в переданном множестве стоки четной длины
     */
    public static void deleteEvenLength(Set<String> set) {

        Iterator<String> it = set.iterator();
        do {
            if (it.next().length() % 2 == 0) it.remove();
        } while (it.hasNext());

    }
}
