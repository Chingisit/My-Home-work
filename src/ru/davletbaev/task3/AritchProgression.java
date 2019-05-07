package ru.davletbaev.task3;

import java.util.Scanner;

public class AritchProgression {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите 1-й член: ");
        int a = scanner.nextInt();
        System.out.print("Введите разность прогрессии: ");
        int c = scanner.nextInt();
        System.out.print("Введите кол-во членов: ");
        int b = scanner.nextInt();
        for (int i = 0; i < b; i++) {
        int ap  = (i * c)  + a;
            System.out.print(ap + " ");
        }
        scanner.close();
    }
}
