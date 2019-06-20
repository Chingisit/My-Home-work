package ru.davletbaev.task17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
      public static void main(String[] args) {
            List<Person> person = new ArrayList<>();
            person.add(new Person("�����", 24));
            person.add(new Person("�����", 24));
            person.add(new Person("������", 25));
            person.add(new Person("������", 28));
            person.add(new Person("����", 23));
            person.add(new Person("���������", 60));

            show(person);

            Collections.sort(person, new PersonSuperComparator());

            show(person);
        }

        private static void show(List<Person> person) {
            for (Person Person : person) {
                System.out.println(Person.getName() + " " + Person.getAge());
            }
            System.out.println();
        }

    }
