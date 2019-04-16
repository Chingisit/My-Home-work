package ru.davletbaev.task1;

public class TimeConversion {

    public static void main(String[] args) {
        System.out.println("Конвертация времени");

        double second1 = 5600;
        double second2 = 3600;

        double c = second1 / second2;

        System.out.format("%.2f часа.",c);
    }
}

