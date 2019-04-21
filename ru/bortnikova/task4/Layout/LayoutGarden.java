package ru.bortnikova.task4.Layout;
// это я пока не использую
import ru.bortnikova.task4.Plants.*;

public class LayoutGarden {
    int lendLength; // длина участка , масштаб 1:20
    int lendWidth; // ширина участка, масштаб 1:20
    private Plant plants[]; // массив растений для сада

    public LayoutGarden(int length, int width, int countPlants) {
        this.lendLength = length;
        this.lendWidth = width;
        Plant[] plants = new Plant[countPlants];
    }

}




