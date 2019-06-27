package ru.bortnikova.task20;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;


public class JsonApp {
    public static void main(String[] args) throws MalformedURLException {
        LocCity lcity;
        Weather weather;
        byte[] buff = new byte[2000];

        URL url = URI.create("https://www.metaweather.com/api/location/search/?query=London").toURL();
        try (InputStream inputStream = url.openStream();
             BufferedInputStream bis = new BufferedInputStream(inputStream)) {

            int len = bis.read(buff);

            String str = new String(buff);
            str = str.substring(1, len - 1);
            // Здесь обрезаю скобки [ и ] ,
            // которые приходят первым и последним символом,
            // не поняла почему это происходит, в формате JSON так не должно быть
            System.out.println(str);

            ObjectMapper objectMapper = new ObjectMapper();
            lcity = objectMapper.readValue(str, LocCity.class);
            System.out.println(lcity.toString());

            URL url2 = URI.create("https://www.metaweather.com/api/location/" + lcity.getWoeid()).toURL();
            InputStream inputStream2 = url2.openStream();
            BufferedInputStream bis2 = new BufferedInputStream(inputStream2);
            bis2.read(buff);
            String str2 = new String(buff);
            System.out.printf(str2);
            // что-то пошло не так в позиции 979 ((( ???
            weather = objectMapper.readValue(str2,Weather.class);
            System.out.printf(weather.toString());

        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }
}

