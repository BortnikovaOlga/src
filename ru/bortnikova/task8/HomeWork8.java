package ru.bortnikova.task8;

import java.util.Date;

public class HomeWork8 {
    public static void main(String[] args) {

        System.out.println("1) Тестируем методы из класса Calculator");

        System.out.println(Calculator.div(6, 1.5));
        System.out.println(Calculator.mult(1.5, 2.5));
        System.out.println(Calculator.add(3, 2.5));
        System.out.println(Calculator.sub(3.7, 2));
        System.out.println(Calculator.percent(3.8, 20));

        System.out.println("2) Тестируем счетчик созданных объектов класса CalcClass");

        CalcClass c1 = new CalcClass();
        CalcClass c2 = new CalcClass();
        CalcClass c3 = new CalcClass();

        System.out.println("количество объектов "+CalcClass.getCounterClass());


        System.out.println("3) Тестируем метод конвертор объекта класса Dogovor в объект класса Act");

        Dogovor dogovor=new Dogovor(1, new Date(), new String[]{"товар1","товар2","товар3"});

        Act act=Dogovor.convertToAct(dogovor);
        Act.printAct(act);

    }
}
