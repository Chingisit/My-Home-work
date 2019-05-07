package ru.davletbaev.task6;

public class Counter {
    public static int counter;

    Counter() {
        count();
    }

    public static void main(String[] args) {
        Counter counter1 = new Counter();
        Counter counter2 = new Counter();
        Counter counter3 = new Counter();
        Counter counter4 = new Counter();

        System.out.println(Counter.counter);
    }


    public static void count() {
        counter++;
    }
}