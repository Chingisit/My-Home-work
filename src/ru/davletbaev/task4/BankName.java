package ru.davletbaev.task4;

import java.util.Arrays;

public class BankName {
    private String title;
    private BankBranch[] bankBranches = new BankBranch[5];

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public BankBranch[] getBankBranches() {
        return bankBranches;
    }

    public void setBankBranches(BankBranch[] bankBranches) {
        this.bankBranches = bankBranches;

    }

    @Override
    public String toString() {
        return "BankName{" +
                "title='" + title + '\'' +
                ",\n bankBranches=" + Arrays.toString(bankBranches) +
                '}';
    }
}

