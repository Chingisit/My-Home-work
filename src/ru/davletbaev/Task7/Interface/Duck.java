package ru.davletbaev.Task7.Interface;

public class Duck extends Animal implements Fly, Run, Swim {
    @Override
    public void flying() {
        System.out.println("Умею летать!");
    }

    @Override
    public void swimming() {
        System.out.println("Плавать");

    }

    @Override
    public void running() {
        System.out.println("И немножко бегать!");
    }

    @Override
    public void getName() {
        System.out.println("Утка");

    }
}
