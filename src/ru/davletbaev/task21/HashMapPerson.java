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

////        2� ������� � �������������� stream
//        map.values()
//                .stream()
//                .filter(person -> Collections.frequency(map.values(), person) > 1)
//                .collect(Collectors.toList())
//                .forEach(person -> removeItemFromMapByValue(map, person));

    }

    /*
    --map, copy--
    person1:
    Key2, person1 =  Person{age=29, secondName='�������', gender='���'}
    Key1, person1 = Person{age=29, secondName='�������', gender='���'}


    Key6, person2 = Person{age=35, secondName='������', gender='���'}
    mKey5, person2 = Person{age=35, secondName='������', gender='���'}

    ----
    Key4, person3 =  Person{age=34, secondName='��������', gender='���'}
    person4:
    Key3, person4 =  Person{age=34, secondName='��������', gender='���'}
     */

    //value = person1 and value = person2;
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
