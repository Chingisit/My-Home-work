package ru.davletbaev.task2;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        int range = 100;
        int exit = 123;
        int prevNumber = 0;
        int inputNumber;
        int randomNumber = (int) (Math.random() * range);
        Scanner scanner = new Scanner(System.in);

        System.out.print("И Г Р А  *У Г А Д А Й  Ч И С Л О!!!*\n");
        System.out.println("*Для выхода введите - 123*");

        while (true) {
            System.out.println("Угадай число от 0 до " + range);
            inputNumber = scanner.nextInt();

            if (inputNumber == randomNumber) {
                System.out.println("Поздравляю вы угадали! Ура");
                break;
            }

            if (inputNumber == exit) {
                System.out.println("Уже уходите? Жаль :(");
                break;
            }

            if (inputNumber < 0 || inputNumber > 100) {
                continue;
            }

            int prevDifference = Math.abs(randomNumber - prevNumber);
            int difference = Math.abs(randomNumber - inputNumber);

            if (prevDifference >= difference ) {
                System.out.println("Горячё");
            } else {
                System.out.println("Холодно");
            }

            prevNumber = inputNumber;
        }
        scanner.close();
    }
}

/*
public class Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("И Г Р А  *У Г А Д А Й  Ч И С Л О!!!*\n");
        System.out.println("*Для выхода введите - 123*");
        int range = 100;
        int exit = 123;
        int number = (int) (Math.random() * range);
        while (true) {
            System.out.println("Угадай число от 0 до " + range);
            int input_number = scanner.nextInt();
            if (input_number == number) {
                System.out.println("Поздравляю вы угадали! Ура");
                break;
            } else if (input_number == exit) {
                    System.out.println("Уже уходите? Жаль :(");
                    break;
            } else if (input_number < 0) {
                System.out.println("Вам не холодно?");
            } else if (input_number > range) {
                System.out.println("Ваше значение больше " + range);
            } else if (input_number > number) {
                System.out.println("Горячё");
            } else {
                System.out.println("Холодно");
            }
        }
            scanner.close();
        }
  }
*/