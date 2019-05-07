package ru.davletbaev.task3;

import java.util.Scanner;

public class CheckNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int exit = 123;
        int inputNumber;
        while (true) {
            System.out.print("Введите любое число: ");
            inputNumber = scanner.nextInt();
            if (inputNumber == exit) {
                System.out.println("Спасибо что были с нам");
                break;
            }
            if (inputNumber == 0) {
                System.out.println("Ваше число нуливое");
                continue;
            }
            if (inputNumber > 0 && inputNumber % 2 == 0){
                System.out.println("Положительное чётное число! ");
            } else if (inputNumber > 0 && inputNumber % 2 != 0){
                System.out.println("Положительное нечетное число");
            } else if (inputNumber < 0 && inputNumber % 2 == 0) {
                System.out.println("Отрицательное четное число");
            } else {
                System.out.println("Отрицательное нечетное число");
                }
            }

        scanner.close();
        }
    }
