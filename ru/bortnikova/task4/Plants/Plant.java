package ru.bortnikova.task4.Plants;
// здесь модель садового растения
public class Plant {
    private String plantName;
    private int x; // локация на плане сада
    private int y;
    private int height;
    private int width; // ширина растения в см
    private int SunLighting; //условия освещенности растения


    public Plant(String name, int width) {
        this.plantName = name;
        this.width = width;
    }

    public void setXY(int x, int y) {
        this.x = x; // отметить дерево на плане участка
        this.y = y;

    }

    public void fertilize (){
        System.out.println(this.plantName+"Внести комплексное удобрение");
        // расчет произвести , например, от габаритов растения
    }
    public void irrigationPlant(int moisture) { // полив растения в зависимости от влажности грунта
        switch (moisture) {
            case 1:
                System.out.println("слабый полив");
                break;
            case 2:
                System.out.println("умеренный полив");
                break;
            case 3:
                System.out.println("обильный полив");
                break;
            default:
                System.out.println("полив не требуется");

        }
    }

    public int getSunLighting() {
        return SunLighting; // вернуть требование растения к солнечному освещению
    }

    public void setSunLighting(int sunLighting) {
        SunLighting = sunLighting;
    }

}
