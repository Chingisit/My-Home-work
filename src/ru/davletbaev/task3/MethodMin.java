package ru.davletbaev.task3;

import java.util.Scanner;

public class MethodMin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int num1 = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int num2 = scanner.nextInt();

        if (num1 == num2) {
            System.out.println("Числа раны!");
        } else  if (num1 > num2) {
            System.out.println("Минимальное число: " + num2);
        } else {
            System.out.println("Минимальное число: " + num1);
        }
        scanner.close();
    }
}