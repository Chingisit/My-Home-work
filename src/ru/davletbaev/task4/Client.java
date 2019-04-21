package ru.davletbaev.task4;

import java.time.LocalDate;

public class Client extends Person {
    private int paymentNoticeNumber;

    public Client(String firstName, String lastName, LocalDate birthday, int passportNumber) {
        super(firstName, lastName, birthday, passportNumber);
    }

    public int getPaymentNoticeNumber() {
        return paymentNoticeNumber;
    }

    public void setPaymentNoticeNumber(int paymentNoticeNumber) {
        this.paymentNoticeNumber = paymentNoticeNumber;
    }
}
