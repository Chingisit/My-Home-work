package ru.davletbaev.task15;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class Main {

    private static  final ObjectMapper OBJECT_MAPPER = new ObjectMapper();

    private final static String URL_ADDRESS = "http://api.icndb.com/jokes/random?firstName=John&amp;lastName=Doe";

    public static void main(String[] args) {
        JsonTest json;
        URL url = null;
        try {
            url = new URL(URL_ADDRESS);
            try (BufferedReader readerURL = new BufferedReader(new InputStreamReader(url.openStream()))) {
                json = OBJECT_MAPPER.readValue(readerURL, JsonTest.class);
                OBJECT_MAPPER.writeValue(System.out, json);
            }
            System.out.println(json);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
