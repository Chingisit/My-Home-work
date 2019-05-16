package ru.davletbaev.Task7.Interface;

public class Dog extends Animal implements Run, Fly, Swim {

    @Override
    public void running() {
        System.out.println("Умею бегать");

    }

    @Override
    public void flying() {

    }

    @Override
    public void getName() {
        System.out.println("Собака");

    }

    @Override
    public void swimming() {

    }
}
