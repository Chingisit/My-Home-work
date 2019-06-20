package ru.davletbaev.task19;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<>();
        set.add("foo");
        set.add("buzz");
        set.add("bar");
        set.add("fork");
        set.add("bort");
        set.add("spoon");
        set.add("!");
        set.add("dude");

        System.out.println(set);

        System.out.println(removeEvenLength(set));

    }

    public static Set<String> removeEvenLength(Set<String> set) {
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().length() % 2 == 0 ) {
                iterator.remove();
            }
        }
        return set;
    }

}
