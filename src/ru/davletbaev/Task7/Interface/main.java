package ru.davletbaev.Task7.Interface;

public class main {
    public static void main(String[] args) {
        Animal cat = new Cat();
        Animal dog = new Dog();
        Animal mouse = new Mouse();
        Animal duck = new Duck();

        cat.getName();
        cat.running();
        dog.getName();
        dog.running();
        mouse.getName();
        mouse.running();
        duck.getName();
        duck.flying();
        duck.swimming();
        duck.running();
    }

}
