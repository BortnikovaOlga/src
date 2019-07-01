package ru.bortnikova.task20;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class WeatherData {
    String wind_direction_compass;
    String applicable_date;
    float min_temp;
    float max_temp;
    float wind_speed;
    float wind_direction;
    float air_pressure;

    public String getWind_direction_compass() {
        return wind_direction_compass;
    }

    public String getApplicable_date() {
        return applicable_date;
    }

    public float getMin_temp() {
        return min_temp;
    }

    public float getMax_temp() {
        return max_temp;
    }

    public float getWind_speed() {
        return wind_speed;
    }

    public float getWind_direction() {
        return wind_direction;
    }

    public float getAir_pressure() {
        return air_pressure;
    }

    @Override
    public String toString() {
        return "\nWeatherData{\n" +
                "applicable_date=" + applicable_date +"\n"+
                "min_temp=" + min_temp +"\n"+
                "max_temp=" + max_temp +"\n"+
                "wind_speed=" + wind_speed +"\n"+
                "wind_direction=" + wind_direction +"\n"+
                "air_pressure=" + air_pressure +
                "\n}";
    }
}
