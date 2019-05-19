package ru.bortnikova.task13;

public enum Food {
    APPLE("яблоко"),
    PORRIDGE ("каша"),
    MEATBOLL("тефтелька"),
    PASTA("макароны"),
    SOUP("суп"),
    CARROT("морковь"),
    COMPOTE("компот"),
    JELLY("кисель"),
    TEA("чай");

    private String named;

    Food(String named) {
        this.named = named;
    }

    public String getnamed() {
        return this.named;
    }
}
