package ru.bortnikova.task4.Layout;
// Сборка модели сада

import ru.bortnikova.task4.Plants.*;


public class Garden {
    public static void main(String[] args) {
        Plant plantPointer;
        // устроим сад , посадки - 15 растений
        FruitTree[] fruitGarden = new FruitTree[10];
        OrnamentalPlant[] ornamBushes = new OrnamentalPlant[5];

        // внесем в план сада плодовое дерево
        fruitGarden[0]=new FruitTree("Груша Лесная красавица",400,8);
        // внесем в план сада декоративный кустарник
        ornamBushes[0] = new OrnamentalPlant("роза чайная Сool water", 50, 4, 6, true);
        // внесем в план сада декоративный кустарник
        fruitGarden[0].fertilize();
        fruitGarden[0].irrigationPlant(2);
        ornamBushes[0].fertilize();
        ornamBushes[0].irrigationPlant(1);


        // выходные быстро прошли, домашку делать некогда оказалось, но постараюсь доработать  ))))
    }
}
