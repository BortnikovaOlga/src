package ru.bortnikova.task18;

import java.io.*;

public class CoverterApp {
    public static void main(String[] args) {

        String strBuff = "Послушайте!\n" +
                "Ведь, если звезды зажигают -\n" +
                "значит - это кому-нибудь нужно?\n" +
                "Значит - кто-то хочет, чтобы они были?\n" +
                "Значит - кто-то называет эти плевочки\n" +
                " жемчужиной?\n" +
                "И, надрываясь\n" +
                "в метелях полуденной пыли,\n" +
                "врывается к богу,\n" +
                "боится, что опоздал,\n" +
                "плачет,\n" +
                "целует ему жилистую руку,\n" +
                "просит -\n" +
                "чтоб обязательно была звезда! -\n" +
                "клянется -\n" +
                "не перенесет эту беззвездную муку!\n" +
                "А после\n" +
                "ходит тревожный,\n" +
                "но спокойный наружно.\n" +
                "Говорит кому-то:\n" +
                "\"Ведь теперь тебе ничего?\n" +
                "Не страшно?\n" +
                "Да?!\"\n" +
                "Послушайте!\n" +
                "Ведь, если звезды\n" +
                "зажигают -\n" +
                "значит - это кому-нибудь нужно?\n" +
                "Значит - это необходимо,\n" +
                "чтобы каждый вечер\n" +
                "над крышами\n" +
                "загоралась хоть одна звезда?!\n(В.В. Маяковский)";

        // далее записываю этот текст в файл
        try (FileWriter fw = new FileWriter("fileUTF8.txt")) {
            fw.write(strBuff);

        } catch (IOException e) {
            System.out.println(e.getStackTrace());
        }

        // далее читаю символы из файла, изменяю кодировку и делаю вывод в другой файл

        try (Reader reader = new FileReader("fileUTF8.txt");
             FileOutputStream os = new FileOutputStream("fileWin1251.txt")) {

            char[] cbuff = new char[200];
            int numChars; // сколько прочитано на самом деле
            while ((numChars = reader.read(cbuff)) > 0) {
                String str = new String(cbuff, 0, numChars);
                System.out.printf(str);
                os.write(str.getBytes("Windows-1251"));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
