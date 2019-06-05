package ru.bortnikova.task19;

import java.io.*;
import java.util.Locale;
import java.util.Scanner;

public class CheckApp {
    public static void main(String[] args) {

        try (FileReader fr = new FileReader("./src/ru/bortnikova/task19/prod.txt");
             Scanner scanner = new Scanner(fr);
             PrintStream prn = new PrintStream("./src/ru/bortnikova/task19/check.txt")

        ) {
            scanner.useLocale(Locale.ENGLISH);
            float total = 0;
            prn.printf("%-20s %10s %10s %10s\n", "Наименование", "Цена", "Количество", "Стоимость");

            while (scanner.hasNext()) {
                String nameProd = readNameProd(scanner);
                boolean weight = (scanner.hasNextInt() ? false : true);
                float count = scanner.nextFloat();
                float price = scanner.nextFloat();
                float cost = (float) ((long) (count * price * 100)) / 100;
                total += cost;
                if (weight)
                    prn.printf("%-20s %10.2f %10.3f %10.2f\n", nameProd, price, count, cost);
                else
                    prn.printf("%-20s %10.2f %10d %10.2f\n", nameProd, price, (int) count, cost);

            }
            prn.printf("\nИтого %47.2f", total);
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    // чтение составного наименования продукта
    static String readNameProd(Scanner scanner) {
        String nameProd = scanner.next();
        if (!(scanner.hasNextInt() | scanner.hasNextFloat()))
            nameProd += " " + readNameProd(scanner);
        return nameProd;
    }
}

