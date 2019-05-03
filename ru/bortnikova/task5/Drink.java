package ru.bortnikova.task5;

public enum Drink {
    ESPRESSO("Эспрессо", 50),
    CAPPUCCINO("Каппучино", 60),
    AMERICANO("Американо", 50),
    LATTE("Латте", 70),
    VIENNACOFFEE("Венский кофе", 70),
    MACCHIATO("Маккиато", 60),
    GLACE("Гляссе", 80),
    ROMANO("Романо", 50),
    BLACKTEA("Черный чай", 30),
    GREENTEA("Зеленый чай", 30);

    private String named;
    private int cost;

    Drink(String named, int cost) {
        this.named = named;
        this.cost = cost;
    }

    public int getCost() {
        return cost;
    }

    public String getNamed() {
        return named;
    }
}