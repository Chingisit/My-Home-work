package ru.davletbaev.task10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        for (DrinkList drinkList : DrinkList.values())
        System.out.println(drinkList.getDesc() + " - " + drinkList.getPrice() + " руб. - " + drinkList.getCode());
        Scanner scanner = new Scanner(System.in);
        System.out.print("Выберите напиток: ");
        VendingMachine vendingMachine = new VendingMachine();

        int num = scanner.nextInt();
        vendingMachine.setDrinks(DrinkList);
        System.out.println("Внесите деньги: ");

        int sum = scanner.nextInt();
        vendingMachine.addMoney(sum);

      /*if (code == 1)
            System.out.println("Вы выбрали - " + DrinkList.FRESH_APLLE);
        if (code == 2)
            System.out.println("Вы выбрали - " + DrinkList.PEPSI);
        if (code == 3)
            System.out.println("Вы выбрали - " + DrinkList.COCA_COLA);
        if (code == 4)
            System.out.println("Вы выбрали - " + DrinkList.BLACK_TEA);
        if (code == 5)
            System.out.println("Вы выбрали - " + DrinkList.GREEN_TEA);
        if (code == 6)
            System.out.println("Вы выбрали - " + DrinkList.COFFE_LATE);
        if (code == 7)
            System.out.println("Вы выбрали - " + DrinkList.COFFE_AMERICANO);
        if (code == 8)
            System.out.println("Вы выбрали - " + DrinkList.HOT_CHOKOLATE);
        if (code == 9)
            System.out.println("Вы выбрали - " + DrinkList.WATHER);
        else
            System.out.println("УПС - Товар не найден");*/
        scanner.nextLine();
        scanner.close();

    }
}


