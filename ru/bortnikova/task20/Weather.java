package ru.bortnikova.task20;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Arrays;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Weather {
    WeatherData[] consolidated_weather;
    String time;
    String sun_rise;
    String sun_set;

    public WeatherData[] getConsolidated_weather() {
        return consolidated_weather;
    }

    public String getTime() {
        return time;
    }

    public String getSun_rise() {
        return sun_rise;
    }

    public String getSun_set() {
        return sun_set;
    }

    @Override
    public String toString() {
        return "Weather{\n" +
                "consolidated_weather=" + Arrays.toString(consolidated_weather) +
                "\ntime=" + time  +"\n"+
                "sun_rise=" + sun_rise +"\n"+
                "sun_set=" + sun_set +"\n"+
                '}';
    }
}
