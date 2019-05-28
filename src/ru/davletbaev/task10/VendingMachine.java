package ru.davletbaev.task10;

public class VendingMachine {
    private double money = 0;
    private DrinkList[] drinks;

    public VendingMachine(DrinkList[] drinks) {
        this.drinks = drinks;
    }

    public void addMoney(double money) {
        this.money = money;
    }

    private DrinkList getDrink(int key) {
        if (key < drinks.length){
            return drinks[key];
        } else {
            return null;
        }
    }

    public void giveMeADrink(int key){
        if (this.money > 0) {
            DrinkList drink = getDrink(key);

            if (drink != null) {
                if (drink.getPrice() <= money) {
                    System.out.println("Возьмите ваш напиток: " + drink.getDesc());
                    money -= drink.getPrice();
                } else {
                    System.out.println("Недостаточно средств!");
                }
            }
        } else {
            System.out.println("Халявы тут нет!");
        }
    }

    public void setDrinks(DrinkList[] drinks) {
        this.drinks = drinks;
    }
}
