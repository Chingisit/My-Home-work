package ru.davletbaev.Task7.Human;

public class main implements Runeble, Swimming {
        public static void main(String[] args) {
        Human human = new Human() {
            @Override
            public void Swim() {

            }

            @Override
            public void run() {

            }
        };

    }

    @Override
    public void run() { System.out.println("Бегаю");

    }

    @Override
    public void swim() {   System.out.println("Плаваю");

    }
}

