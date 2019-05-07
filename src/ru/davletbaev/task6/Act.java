package ru.davletbaev.task6;

import java.util.Arrays;
import java.util.Date;

public class Act {
    private String number;
    private Date date;
    private String [] product;

    public Act(String number, Date date, String[] product) {
        this.number = number;
        this.date = date;
        this.product = product;
    }

    @Override
    public String toString() {
        return "Акт " +
                "№ " + number + '\n' +
                "Дата " + date + '\n' +
                "Список товаров - " + Arrays.toString(product) + ".";
    }
}
