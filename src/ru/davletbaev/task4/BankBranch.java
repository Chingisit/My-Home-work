package ru.davletbaev.task4;

import java.util.Arrays;

public class BankBranch {
    private String title;
    private PaymentWindow[] paymentWindows = new PaymentWindow[5];

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public PaymentWindow[] getPaymentWindows() {
        return paymentWindows;
    }

    public void setPaymentWindows(PaymentWindow[] paymentWindows) {
        this.paymentWindows = paymentWindows;
    }

    @Override
    public String toString() {
        return " подразделение в г.Иннополис" +
                " № 777" +
                "\n Окно оплаты - " + Arrays.toString(paymentWindows);
    }
}
