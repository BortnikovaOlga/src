package ru.bortnikova.task29;

public class PersonBookApp {
    public static void main(String[] args) {
        Person person1 = new Person("Петрова",29,"жен");
        Person person2 = new Person( "Сидорова",34, "жен");
        Person person3 = new Person( "Тихонова",34, "жен");
        Person person4 = new Person("Петров",35, "муж");

        PersonBook pBook=new PersonBook();

        pBook.put("Key1", person1);
        pBook.put("Key2", person1);
        pBook.put("Key3", person2);
        pBook.put("Key4", person3);
        pBook.put("Key5", person4);
        pBook.put("Key6", person4);
        pBook.put("Key7", person4);

        System.out.println(pBook.toString());

        // удалить все дублирующиеся записи
        pBook.removeTheDuplicates();
        System.out.println(pBook.toString());
    }
}
