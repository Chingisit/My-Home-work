package ru.davletbaev.task4;

import java.time.LocalDate;

public class BankApp {
    public static void main(String[] args) {
        Client ildar = new Client("Ильдар", "Давлетбаев", LocalDate.now(), 1234567890);
        //Client rustam = new Client("Рустам","Давлетбаев", LocalDate.now(),1234567890);

        //rustam.setPaymentNoticeNumber(321);
        ildar.setPaymentNoticeNumber(123);

        BankName SuperBank = new BankName();
        BankBranch Innopolis = new BankBranch();
        PaymentWindow A5 = new PaymentWindow();

        A5.setClients(new Client[]{ildar});
        Innopolis.setPaymentWindows(new PaymentWindow[]{A5});
        SuperBank.setBankBranches(new BankBranch[]{Innopolis});

        System.out.println(SuperBank);
    }
}
