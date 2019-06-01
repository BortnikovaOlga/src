package ru.bortnikova.task17;

public class MyLibApp {
    public static void main(String[] args) {
        Library lib2, lib1 = new Library();
        Book book1 = new Book("Собрание сочинений. Том 1", "А.С. Пушкин", 1980);
        Book book2 = new Book("Собрание сочинений. Том 2", "А.С. Пушкин", 1980);
        Book book3 = new Book("Собрание сочинений. Том 3", "А.С. Пушкин", 1980);
        lib1.addBook(book1);
        lib1.addBook(book2);
        lib1.addBook(book3);
        Library.writeBooks(lib1, "lib1.dat");

        lib2 = Library.readBooks("lib1.dat");
        if (lib2 != null) {
            Book book4 = new Book("Собрание сочинений. Том 1", "В.В. Маяковский", 1981);
            Book book5 = new Book("Собрание сочинений. Том 2", "В.В. Маяковский", 1981);
            lib2.addBook(book4);
            lib2.addBook(book5);
            lib2.listBooks();
            Library.writeBooks(lib2, "lib2.dat");
        }
    }
}
