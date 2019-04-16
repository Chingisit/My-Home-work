package ru.davletbaev.task2;

import java.util.Scanner;

public class Salary {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите начисленную З/П в (руб.): ");
        int accrued = scanner.nextInt();
        double tallage = 0.13;
        double calculat = accrued * tallage;
        double cash = accrued - calculat;
        System.out.format("Итого З/П на руки: %.2f руб.\n" , cash);
        scanner.close();
        System.out.println("Хорошей траты!");
    }
}