package ru.bortnikova.task9;

public abstract class Person implements Run, Swim {
    private boolean sportsman;
    private String name;
    private String kindOfSport;

    Person(String name){
        this.name = name;
        this.sportsman=false;
    }
    Person(String name, String kindOfSport){
        this.name=name;
        this.kindOfSport=kindOfSport;
        this.sportsman=true;
    }

    public boolean isSportsman(){
        return sportsman;
    }

    public void setSportsman(boolean sportsman) {
        this.sportsman = sportsman;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setKindOfSport(String kindOfSport) {
        this.kindOfSport = kindOfSport;
    }

    public String getKindOfSport() {
        return kindOfSport;
    }

    public void swim(){
        System.out.println("плаванье в бассейне");
    }
    public void swim(int boote){
        System.out.println("плаванье на байдарке, каноэ");
    }

    public void run() {
        System.out.println("Тренировочный бег по стадиону");

    }
}
