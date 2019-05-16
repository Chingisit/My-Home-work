package ru.davletbaev.task7.Human;

public class Sport extends Human implements Runeble, Swimming {
    @Override
    public void swim() {
        System.out.println("Люблю плавать!");

    }

    @Override
    public void run() { System.out.println("Люблю бегеть!");

    }
}
