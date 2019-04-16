package ru.davletbaev.task2;

import java.util.Scanner;

public class PriceGasoline {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите кол-во литров: ");
        int num = scanner.nextInt();
        int prise = 43;
        int num2 = num * prise;
        System.out.format("Стоимость бензина соствила: %d руб.\n" , num2);
        scanner.close();
        System.out.println("Спасибо!");
    }
}
