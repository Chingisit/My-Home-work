package ru.davletbaev.task10;

import java.util.Scanner;

public class VendingMachine {
    private DrinkList[] drinks;
    private Scanner scanner;

    public VendingMachine(DrinkList[] drinks, Scanner scanner) {
        this.drinks = drinks;
        this.scanner = scanner;
    }

    private DrinkList getDrink(int code) {
        while(true) {
            for (DrinkList drinkList : drinks) {
                if (code == drinkList.getCode()) {
                    System.out.println("Вы выбрали - " + drinkList.getDesc());
                    return drinkList;
                }
            }
            System.out.println("УПС - Товар не найден");
        }
    }

    public void giveMeADrink(){
        System.out.print("Выберите напиток: ");
        int code = scanner.nextInt();

        DrinkList drink = getDrink(code);
        int money = 0;

        do {
            System.out.println("Внесите деньги: ");
            money += scanner.nextInt();

            if (drink.getPrice() <= money) {
                System.out.println("Возьмите ваш напиток: " + drink.getDesc());
            } else {
                System.out.println("Недостаточно средств!");
            }

        } while (money < drink.getPrice());
    }
}