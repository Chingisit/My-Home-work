package ru.davletbaev.task7.Human;

public class Sport extends Human implements Runeble, Swimming {


    @Override
    public void swim() {
        System.out.println(getName() + " люблю плавать! ");

    }

    @Override
    public void run() { System.out.println(getName() + " люблю бегеть! ");

    }

    @Override
    public String getName() {
        return "Привет я человек! Я ";
    }
}
