package ru.davletbaev.task7.Interface;

public class Cat extends Animal implements Run, Fly, Swim {

    @Override
    public void getName() {

        System.out.println("Я Кошка");
    }

    @Override
    public void running() {
        System.out.println("Я отлично бегаю");

    }

    @Override
    public void flying() {

    }

    @Override
    public void swimming() {

    }
}
