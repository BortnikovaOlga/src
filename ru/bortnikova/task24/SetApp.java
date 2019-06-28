package ru.bortnikova.task24;

import java.util.HashSet;
import java.util.Set;


public class SetApp {
    public static void main(String[] args) {
        Set<String> strSet = new HashSet<String>();
        strSet.add("foo");
        strSet.add("buzz");
        strSet.add("bar");
        strSet.add("fork");
        strSet.add("bort");
        strSet.add("spoon");
        strSet.add("!");
        strSet.add("dude");

        System.out.println("Дано множество");
        System.out.println(strSet.toString());

        Set<String> delSet;
        delSet = StrSet.removeEvenLength(strSet);

        // здесь вызываю метод, не изменяющий первое множество
        System.out.println("Получили множество, не содержащее строк четной длины");
        System.out.println(delSet.toString());

        // Если необходимы преобразования с исходным множеством , далее два варианта

        //1 вариант
        /*strSet.retainAll(delSet);
        System.out.println("После удаления в исходном с помощью retainAll()");
        System.out.println(strSet.toString());*/

        //2вариант
        /*StrSet.deleteEvenLength(strSet);
        System.out.println("После удаления в исходном отдельным методом");
        System.out.println(strSet.toString());*/

    }

}
