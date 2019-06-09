package ru.bortnikova.task19;

import java.io.*;
import java.math.BigDecimal;
import java.util.Locale;
import java.util.Scanner;

public class CheckApp {
    public static void main(String[] args) {

        try (FileReader fr = new FileReader("./src/ru/bortnikova/task19/prod.txt");
             Scanner scanner = new Scanner(fr);
             PrintStream prn = new PrintStream("./src/ru/bortnikova/task19/check.txt")

        ) {
            scanner.useLocale(Locale.ENGLISH);
            BigDecimal total = new BigDecimal(0);
            prn.printf("%-20s %10s %10s %10s\n\n", "Наименование", "Цена", "Количество", "Стоимость");
            System.out.printf("%-20s %10s %10s %10s\n\n", "Наименование", "Цена", "Количество", "Стоимость");
            while (scanner.hasNext()) {
                String nameProd = readNameProd(scanner);
                boolean weight = !scanner.hasNextInt();
                float count = scanner.nextFloat();
                float price = scanner.nextFloat();
                BigDecimal cost = new BigDecimal(count * price);
                cost = cost.setScale(2, BigDecimal.ROUND_HALF_UP);
                total = total.add(cost);
                if (weight){
                    prn.printf("%-20s %10.2f %10.3f %10.2f\n", nameProd, price, count, cost);
                    System.out.printf("%-20s %10.2f %10.3f %10.2f\n", nameProd, price, count, cost);}
                else{
                    prn.printf("%-20s %10.2f %10d %10.2f\n", nameProd, price, (int) count, cost);
                    System.out.printf("%-20s %10.2f %10d %10.2f\n", nameProd, price, (int) count, cost);}
            }
            prn.printf("\nИтого %47.2f", total);
            System.out.printf("\nИтого %47.2f", total);
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    // чтение составного наименования продукта
    static String readNameProd(Scanner scanner) {
        String nameProd = scanner.next();
        if (!scanner.hasNextFloat())
            nameProd += " " + readNameProd(scanner);
        return nameProd;
    }
}

