package ru.davletbaev.task6;

import java.util.Date;

public class MainDogToAct {
    public static void main(String[] args) {
        String number = "123";
        Date date = new Date();
        String [] product = {"Блоки строительные", "Теплоблоки", "Кирпичи", "Арматура"};

        Act act = Dogovor.convertToAct(number, date, product);
        System.out.println(act);
    }
}
