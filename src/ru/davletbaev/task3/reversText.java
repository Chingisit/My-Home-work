package ru.davletbaev.task3;

public class reversText {
    public static void main(String[] args) {
        String str = "Привет, как дела?";
        char[] arr = str.toCharArray();
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(" " + arr[i]);
        }
    }
}