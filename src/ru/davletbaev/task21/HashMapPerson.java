package ru.davletbaev.task21;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class HashMapPerson {
    public static Map<String, Person> createMap()
    {
        Map<String, Person> book = new HashMap<>();
        Person person1 = new Person(29,"�������","���");
        Person person2 = new Person(34, "��������", "���");
        Person person3 = new Person(34, "��������", "���");
        Person person4 = new Person(35, "������", "���");
        book.put("Key1", person1);
        book.put("Key2", person1);
        book.put("Key3", person2);
        book.put("Key4", person3);
        book.put("Key5", person4);
        book.put("Key6", person4);
        return book;
    }



    public static void removeTheDuplicates(Map<String, Person> map) {
        Map<String, Person> mapCopy = new HashMap<>(map);

        for (Map.Entry<String, Person> entry : mapCopy.entrySet()) {
            Person person = entry.getValue();

            int frequency = Collections.frequency(mapCopy.values(), person);

            if (frequency > 1) {
                removeItemFromMapByValue(map, person);
            }
        }
    }

    public static void removeItemFromMapByValue(Map<String, Person> map, Person value)
    {
        Map<String, Person> copy = new HashMap<>(map);
        for (Map.Entry<String, Person> pair: copy.entrySet())
        {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

}
