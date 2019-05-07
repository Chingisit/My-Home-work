package ru.davletbaev.task5;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();
        DrinkList drinkList = DrinkList.BLACK_TEA;

        String name = "123";

        DrinkList drinkList1 = drinkList.valueOf(name);
        System.out.println(drinkList1);

        Scanner scanner = new Scanner(System.in);

        System.out.println("введите напиток");
        int code = scanner.nextInt();

        scanner.nextLine();
        System.out.println("введите стоимость");
        int price = scanner.nextInt();

        drinkList = drinkList.of(code);


        if (drinkList.getPrice() == price) {
            System.out.println("Напиток " + drinkList.name() + " оплачен");
        }
        else {
            System.out.println("Напиток " + drinkList.name() + " стоит " + drinkList.getPrice());
        }

        scanner.close();


    }
}
