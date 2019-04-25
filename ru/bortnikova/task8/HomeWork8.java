package ru.bortnikova.task8;


public class HomeWork8 {
    public static void main(String[] args) {

        System.out.println("1) Тестируем методы из класса Calculator");

        System.out.println(Calculator.div(6, 1.5));
        System.out.println(Calculator.mult(1.5, 2.5));
        System.out.println(Calculator.add(3, 2.5));
        System.out.println(Calculator.sub(3.7, 2));
        System.out.println(Calculator.percent(3.8, 20));



        System.out.println("1.2) Тестируем методы из класса Calculator для дробных чисел");

        FractNumber a=new FractNumber(75,62); // а -дробное 75/62
        FractNumber b=new FractNumber(31,25); // b -дробное 31/25

        FractNumber c=Calculator.mult(a,b);
        System.out.println(a.toStr()+"*"+b.toStr()+"="+c.toStr());

        a.setFract(27,8);
        b.setFract (9,11);

        c=Calculator.div(a,b);
        System.out.println(a.toStr()+":"+b.toStr()+"="+c.toStr());

        a.setFract(1,3);
        b.setFract (1,2);

        c=Calculator.sub(a,b);
        System.out.println(a.toStr()+"-"+b.toStr()+"="+c.toStr());

        c=Calculator.add(a,b);
        System.out.println(a.toStr()+"+"+b.toStr()+"="+c.toStr());


    }
}
