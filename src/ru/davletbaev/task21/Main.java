package ru.davletbaev.task21;

import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<String, Person> map = HashMapPerson.createMap();

        map.forEach((key, value) -> {
            System.out.println(key + " " + value);
        });

        System.out.println("==================");

        HashMapPerson.removeTheDuplicates(map);

        map.forEach((key, value) -> {
            System.out.println(key + " " + value);
        });
    }
}
