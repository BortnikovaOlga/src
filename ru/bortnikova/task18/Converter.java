package ru.bortnikova.task18;

import java.io.*;


public class Converter {
    /**
     * метод преобразует файл одной кодировки в файл другой кодировки.
     *
     * @param fileIn  имя входящего файла
     * @param setIn   строка чарсета входящего файла
     * @param fileOut имя результирующего файла
     * @param setOut  строка чарсета исходящего файла
     */
    static void convert(String fileIn, String setIn, String fileOut, String setOut) {
        try (InputStream is = new FileInputStream(fileIn);
             InputStreamReader ir = new InputStreamReader(is, setIn);
             FileOutputStream os = new FileOutputStream(fileOut);) {

            char[] cbuff = new char[200];
            int numChars; // сколько прочитано на самом деле
            while ((numChars = ir.read(cbuff)) > 0) {
                String str = new String(cbuff, 0, numChars);
                System.out.printf(str);
                os.write(str.getBytes(setOut));
            }
            System.out.println("файл " + fileIn + " [ " + setIn + " ] >> в файл " + fileOut + " [ " + setOut + " ] ");
        } catch (
                IOException e) {
            e.printStackTrace();
        }
    }
}
