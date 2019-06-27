package ru.bortnikova.task20;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Arrays;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Weather {
    WeatherData[] consolidated_weather;

    Weather() {
        consolidated_weather = new WeatherData[1];
    }

    @Override
    public String toString() {
        return "Weather{" +
                "consolidated_weather=" + Arrays.toString(consolidated_weather) +
                '}';
    }
}
