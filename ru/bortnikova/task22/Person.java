package ru.bortnikova.task22;

public class Person implements Comparable<Person> {
    String name;
    int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }


    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Person person) {
        int res = this.name.compareTo(person.getName());
        if (res == 0) res = this.age - person.getAge();
        return res;
    }

    @Override
    public String toString() {
        return this.name + " возраст " + String.valueOf(this.age);
    }
}
