package ru.bortnikova.task4.Plants;
// здесь модель фруктового дерева
public class FruitTree extends Plant {
    private int harwestTime; // срок сбора урожая

    public FruitTree(String name, int width, int harwestTime) {
        super(name, width);
        super.setSunLighting(4); // освещение для фруктовых деревьев достаточно значения 4 по шкале от 1 до 5
        this.harwestTime = harwestTime; // сбор урожая зависит от типа дерева или сорта
    }


    public void setHarwestTime(int harwestTime) { // установить примерный срок начала созревания
        this.harwestTime = harwestTime;
    }

    public int getHarwestTime() {
        return harwestTime; //
    }

    public void startHarvesting(int data) {
        if (data >= harwestTime)
            System.out.println("Cобираем урожай");
        else
            System.out.println("Плоды не достигли спелости");

    }
}
