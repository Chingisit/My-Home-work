package ru.davletbaev.task14;

import java.io.FileReader;
import java.util.Formatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String input = "src/ru/davletbaev/task14/products.txt";

        try (FileReader reader = new FileReader(input);
             Scanner scanner = new Scanner(reader)) {
            Formatter formatter = new Formatter();

            formatter.format("%-17s %6s %1s %-6s %12s%n", "������������", "����", "", "���-��", "���������");

            for (int i = 1; i < 48; i++) {
                formatter.format("=");
            }
            formatter.format("%n");

            float sum;
            float result = 0;

            while (scanner.hasNext()) {
                String name = scanner.nextLine();
                float weight = Float.parseFloat(scanner.nextLine());
                float cost = Float.parseFloat(scanner.nextLine());

                sum = weight * cost;
                result += sum;
                formatter.format("%-18s", name);
                formatter.format("%6.2f", cost);
                formatter.format("%s", " x ");
                formatter.format("%6.3f", weight);
                formatter.format("%14s\n", String.format("=%.2f", sum));

            }

            for (int i = 1; i < 48; i++) {
                formatter.format("=");
            }
            formatter.format("%n%-38s %6.2f", "�����", result);

            System.out.println(formatter);

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}