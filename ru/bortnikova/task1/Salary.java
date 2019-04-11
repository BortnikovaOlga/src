package ru.bortnikova.task1;

public class Salary {
    public static void main(String[] args) {
        double accrued = 72000.0;
        double NDFL=0.13;
        System.out.println("Начислено зарплаты " + accrued + " рублей ");
        System.out.printf("зарплата к выдаче на руки без учета вычетов равна " + accrued*(1-NDFL)+" рублей");
    }
}
