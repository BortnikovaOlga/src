package ru.bortnikova.task17;

import java.io.*;


public class Library implements Serializable {

    private static final long serialVersionUID = 575;
    private Book[] books = new Book[0];

    /**
     * @param book добавляет книгу в библиотеку
     */
    void addBook(Book book) {
        Book[] newBooks = new Book[books.length + 1];
        newBooks[books.length] = book;
        System.arraycopy(this.books, 0, newBooks, 0, books.length);
        books = newBooks;
    }

    /**
     * показывает список книг в библиотеке
     */
    void listBooks() {
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].toString());
        }
    }

    /**
     * @param lib  записывает объект Библиотека в файл
     * @param file имя файла
     */
    static void writeBooks(Library lib, String file) {
        try (FileOutputStream os = new FileOutputStream(file);
             ObjectOutputStream oos = new ObjectOutputStream(os)) {
            oos.writeObject(lib);
        } catch (IOException e) {
            System.out.println("невозможно записать файл" + file + e.getMessage());
        }
    }

    /**
     * @param file файл для чтения
     * @return возвращает объект Библиотека после прочтения из файла
     */
    static Library readBooks(String file) {
        try (FileInputStream is = new FileInputStream(file);
             ObjectInputStream ois = new ObjectInputStream(is)) {
            Library lib = (Library) ois.readObject();
            return lib;
        } catch (IOException e) {
            System.out.println("невозможно прочитать файл" + file + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("файл" + file + "не содержит библиотеку" + e.getMessage());
        }
        return null;
    }

}
