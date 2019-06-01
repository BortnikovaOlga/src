package ru.bortnikova.task15;

import org.apache.log4j.Logger;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;


public class myFiles {

    // !!! использую библиотеку из maven log4j:log4j:1.2.17
    private static final Logger logger = Logger.getLogger(myFiles.class);

    public static void main(String[] args) {
        String workDir = "./src/ru/bortnikova/task15";

        // рекурсия, распечатать подкаталоги и файлы
        File dir = new File(workDir);
        printDir(dir, 0);
        // ===========================================================


        // работа с объектами File
        File myFile = new File(workDir + "/newfile1.txt");
        Path myPath;


        // создать файл

        if (myFile.exists()) {
            myFile.delete();
        }
        try {
            myFile.createNewFile();
            System.out.println("создан файл " + myFile.getCanonicalPath());
            logger.info("создан файл " + myFile.getCanonicalPath());

        } catch (IOException e) {
            System.out.println("Невозможно создать файл" + e.getMessage());
        }

        // скопировать

        if (myFile.exists()) {
            File renFile = new File(myFile.getParent() + "/newfile2.txt");
            try {
                Files.copy(myFile.toPath(), renFile.toPath());
                System.out.println("скопирован в " + renFile.getName());

            } catch (IOException e) {
                System.out.println("Не удалось скопировать файл");
                logger.error("Не удалось скопировать файл", e);
            }


        }


    }

    static void printDir(File dir, int numRecurs) {
        int recurs = numRecurs + 1;
        for (File file : dir.listFiles()) {
            if (file.isDirectory()) {
                System.out.println("dir : " + shiftStr(numRecurs) + file.getName());
                printDir(file, recurs);
            }
        }
        for (File file : dir.listFiles()) {
            if (file.isFile()) {
                System.out.println("file: " + shiftStr(numRecurs) + file.getName());
            }
        }
    }

    static String shiftStr(int n) {
        StringBuilder shiftStr = new StringBuilder("");
        for (int i = 1; i <= n; i++) {
            shiftStr.append("   ");
        }
        return shiftStr.toString();
    }
}
