package ru.davletbaev.task4;

import java.util.Arrays;

public class BankBranch {
    private String title;
    private Client[] clients = new Client[10];

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Client[] getClients() {
        return clients;
    }

    public void setClients(Client[] clients) {
        this.clients = clients;
    }

    @Override
    public String toString() {
        return "BankBranch{" +
                "title='" + title + '\'' +
                "\n clients=" + Arrays.toString(clients) +
                '}';
    }
}
