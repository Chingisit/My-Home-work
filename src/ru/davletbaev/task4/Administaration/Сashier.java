package ru.davletbaev.task4.Administaration;

import ru.davletbaev.task4.Person;

import java.time.LocalDate;

public class Сashier  extends Person {
    private int salary;

    public Сashier(String firstName, String lastName, LocalDate birthday, int passportNumber) {
        super(firstName, lastName, birthday, passportNumber);
    }

    int getSalary() {
        return salary;
    }

    void setSalary(int salary) {
        this.salary = salary;
    }
}
