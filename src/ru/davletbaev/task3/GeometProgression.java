package ru.davletbaev.task3;

import java.util.Scanner;

public class GeometProgression {
    public static void main(String[] arg){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите член: ");
        int a=scanner.nextInt();
        System.out.print("Введите знаменатель: ");
        int r=scanner.nextInt();
        System.out.print("Введи количестов членов: ");
        int n=scanner.nextInt();
        System.out.println();
        System.out.print("***Геометрическая прогрессия чисел***\n"+a);
        for(int i=1;i<n;i++)
            System.out.print(" "+(a*=r));
    }
}

