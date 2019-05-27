package ru.davletbaev.task9;
import java.util.Scanner;

public class Mama {
    public static void main(String[] args) {
        System.out.println("Сынок что будешь кушатьт?");
        for (Food food : Food.values())
        System.out.println(food.getName() + " - " + food.getCode());
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (num == 1)
            try {
                Child.eat(Food.APPLE);
            } catch (MyExeption myExeption) {
                myExeption.printStackTrace();
            }
        if (num == 2)
            try {
                Child.eat(Food.CARROT);
            } catch (MyExeption myExeption) {
                myExeption.printStackTrace();
            }
        if (num == 3)
            try {
                Child.eat(Food.PORRIDGE);
            } catch (MyExeption e) {
            e.printStackTrace();
        }

    }
}
