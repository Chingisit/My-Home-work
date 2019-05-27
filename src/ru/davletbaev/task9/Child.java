package ru.davletbaev.task9;

public class Child {
    public static void eat(Food food) throws MyExeption {
        try {
            if (food.getCode() == 3)   {
                throw new MyExeption(food.getName() + " моя не любимая еда!");
            }
            System.out.println("Съел " + food.getName() + " за обе щеки");
        } finally {
            System.out.println("Спасибо мама!");
        }
    }
}
