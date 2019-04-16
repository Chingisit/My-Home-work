package ru.davletbaev.task1;

public class Salary {
    public static void main(String[] args) {
        System.out.println("Зарплата на руки");

        double accrued = 70000;
        double tallage = 0.13;

        double c = accrued * tallage;
        double d = accrued - c;

        System.out.format("%.2f руб.", d);
    }
}
