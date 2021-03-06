package ru.bortnikova.task20;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class LocCity {

    private String title;
    private String location_type;
    private int woeid;
    private String latt_long;

    public String getTitle() {
        return title;
    }

    public String getLocation_type() {
        return location_type;
    }

    public int getWoeid() { return woeid;    }

    public String getLatt_long() {
        return latt_long;
    }

    @Override
    public String toString() {
        return "LocCity{" +
                "title='" + title + '\'' +
                ", location_type='" + location_type + '\'' +
                ", woeid=" + woeid +
                ", latt_long='" + latt_long + '\'' +
                '}';
    }
}
