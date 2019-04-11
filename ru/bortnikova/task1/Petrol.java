package ru.bortnikova.task1;

class FillUpGas{
    private double cost=38.4;
    double FillUpGas(int liters)
    {return cost*liters;}
}
public class Petrol {
    public static void main(String[] args) {
        int liters=10;
        FillUpGas total=new FillUpGas();
        System.out.printf("Вы заправились на "+total.FillUpGas(liters)+" рублей");
    }
}
