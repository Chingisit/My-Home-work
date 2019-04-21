package ru.davletbaev.task3;

import java.util.Scanner;

public class CheckNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int exit = 123;
        int InputNumber;
        while (true) {
            System.out.print("Введите любое число: ");
            InputNumber = scanner.nextInt();
            if (InputNumber == exit) {
                System.out.println("Спасибо что были с нам");
                break;
            }
            if (InputNumber == 0) {
                System.out.println("Ваше число нуливое");
                continue;
            }
            if (InputNumber > 0 && InputNumber % 2 == 0){
                System.out.println("Положительное чётное число! ");
            } else if (InputNumber > 0 && InputNumber % 2 != 0){
                System.out.println("Положительное нечетное число");
            } else if (InputNumber < 0 && InputNumber % 2 == 0) {
                System.out.println("Отрицательное четное число");
            } else {
                System.out.println("Отрицательное нечетное число");
                }
            }

        scanner.close();
        }
    }
