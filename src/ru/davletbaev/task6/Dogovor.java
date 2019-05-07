package ru.davletbaev.task6;

import java.util.Date;

public class Dogovor {
    private String number;
    private Date date;
    private String [] product;

    public static Act convertToAct(String number, Date date, String[] product) {
       Act act = new Act(number, date, product);
       return act;
    }
}
