package ru.bortnikova.task20;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;


public class JsonApp {
    public static void main(String[] args) throws MalformedURLException {
        LocCity[] lcity;
        Weather weather;

        URL url = URI.create("https://www.metaweather.com/api/location/search/?query=Mos").toURL();
        try (InputStream inputStream = url.openStream()) {

            ObjectMapper objectMapper = new ObjectMapper();
            lcity = objectMapper.readValue(inputStream, LocCity[].class);
            System.out.println(lcity[0].toString());

            URL url2 = URI.create("https://www.metaweather.com/api/location/" + lcity[0].getWoeid()).toURL();
            InputStream inputStream2 = url2.openStream();
            System.out.println(url2.toString());

            weather = objectMapper.readValue(inputStream2,Weather.class);
            System.out.printf(weather.toString());

        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }
}

