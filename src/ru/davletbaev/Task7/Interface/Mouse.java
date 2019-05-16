package ru.davletbaev.Task7.Interface;

public class Mouse extends Animal implements Run, Fly, Swim  {
    @Override
    public void getName() {
        System.out.println("Я Мышка нарушка");
    }

    @Override
    public void running() {
        System.out.println("Могу бегать");

    }

    @Override
    public void flying() {

    }

    @Override
    public void swimming() {

    }
}
