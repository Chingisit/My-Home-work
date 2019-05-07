package ru.davletbaev.task6;

public class Counter {
    public static int counter = 0;

    public static void main(String[] args) {
    Less less = new Less();
    less.count();
    less.count();
    less.count();

        System.out.println();
    }
    public void count(){
        counter++;
    }
    }