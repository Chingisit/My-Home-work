package ru.davletbaev.task2;

import java.util.Scanner;

public class TimeConversion {

    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введи любое число секунд: ");
            int num = scanner.nextInt();
            double num1 = 3600;
            double num2 = num / num1;
            System.out.format("Это составляет: %.2f часа.\n" , num2);
            scanner.close();
            System.out.println("Центие время)");
    }
}
