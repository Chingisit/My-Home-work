package ru.davletbaev.task4;

import java.time.LocalDate;

public class BankApp {
    public static void main(String[] args) {
        Client ildar = new Client("Ильдар", "Давлетбаев", LocalDate.now(), 1234567890);
        ildar.setPaymentNoticeNumber(123);

        BankName SuperBank = new BankName();
        BankBranch Innopolis = new BankBranch();

        Innopolis.setClients(new Client[]{ildar});
        SuperBank.setBankBranches(new BankBranch[]{Innopolis});

        System.out.println(SuperBank);
    }
}
