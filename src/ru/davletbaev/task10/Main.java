package ru.davletbaev.task10;

import org.apache.log4j.Logger;
import java.util.Scanner;

public class Main {

    private static final Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        for (DrinkList drinkList : DrinkList.values()) {
            System.out.println(drinkList.getDesc() + " - " + drinkList.getPrice() + " руб. - " + drinkList.getCode());
        }

        logger.info(DrinkList.BLACK_TEA.getDesc());

        Scanner scanner = new Scanner(System.in);

        VendingMachine vendingMachine = new VendingMachine(DrinkList.values(), scanner);
        vendingMachine.giveMeADrink();
        scanner.close();

    }
}

