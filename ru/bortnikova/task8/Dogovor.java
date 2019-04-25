package ru.bortnikova.task8;
// 3) Реализовать два класса: договор и акт. В каждом сделать поля: номер, дата, список товаров (массив строк).
// Написать класс со статическим методом конвертации договора в акт (на вход передавать договор, на выходе получаем акт)

import java.text.SimpleDateFormat;
import java.util.Date;

// класс Договор
class Dogovor {
    private int number;
    private Date data;
    private String[] product;

    Dogovor(int number, Date data, String[] product) {
        this.number = number;
        this.data = data;
        this.product = product;

    }

    // метод конвертации
    static Act convertToAct(Dogovor dogovor) {
        return new Act(dogovor.number, dogovor.data, dogovor.product);

    }
}

// класс Акт
class Act {
    private int number;
    private Date data;
    private String[] product;

    Act(int number, Date data, String[] product) {
        this.number = number;
        this.data = data;
        this.product = product;
    }

    public int getNumber() {
        return number;
    }

    public Date getData() {
        return data;
    }

    public String[] getProduct() {
        return product;
    }

    static void printAct(Act act) {

        SimpleDateFormat formatData = new SimpleDateFormat("dd.MM.YYYY");

        System.out.println("Акт №" + act.getNumber() + " от " + formatData.format(act.getData()));
        for (int i = 0; i < act.product.length; i++) {
            System.out.println(act.product[i]);
        }
    }
}