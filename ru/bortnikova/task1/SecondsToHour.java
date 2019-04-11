package ru.bortnikova.task1;

public class SecondsToHour {
    public static void main(String[] args) {
        int seconds=72885, minutes=0, hours=0;
        System.out.println(seconds + " секунд равно ");
        if (seconds>3600) {
            hours = seconds / 3600;
            seconds %=3600;
        }
         if (seconds>60){
                    minutes = seconds / 60;
                    seconds %=60;
        }
        System.out.printf(hours+" часов "+minutes+" минут "+seconds+" секунд");
    }
}
