package ru.bortnikova.task20;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class WeatherData {
    String applicable_date;
    float min_temp;
    float max_temp;
    float wind_speed;
    float wind_direction;
    float air_pressure;

    @Override
    public String toString() {
        return "WeatherData{" +
                "applicable_date='" + applicable_date + '\'' +
                ", min_temp=" + min_temp +
                ", max_temp=" + max_temp +
                ", wind_speed=" + wind_speed +
                ", wind_direction=" + wind_direction +
                ", air_pressure=" + air_pressure +
                '}';
    }
}
