package ru.davletbaev.task4;

import java.util.Arrays;

public class PaymentWindow {
    private Number [] numbers = new Number[5];
    private Client [] clients = new Client[5];

    public Number[] getNumbers() {
        return numbers;
    }

    public void setNumbers(Number[] numbers) {
        this.numbers = numbers;
    }

    public Client[] getClients() {
        return clients;
    }

    public void setClients(Client[] clients) {
        this.clients = clients;
    }

    @Override
    public String toString() {
        return  " 5 " + "\n" + Arrays.toString(clients) +
                '}';
    }
}

