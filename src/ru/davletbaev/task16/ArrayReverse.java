package ru.davletbaev.task16;

import java.util.Arrays;

public class ArrayReverse {
    private static final int[] array = {4, 7, 9, 6, 14, 74, 43};

    public static void main(String[] args) {
        showArray();
        reverse();
        showArray();
    }

    private static void reverse() {
        for (int out = array.length - 1; out > 1; out--){
            for (int in = 0; in < out; in++){
                int temp = array[in];
                array[in] = array[in + 1];
                array[in + 1] = temp;
            }
        }
    }

    private static void showArray() {
        System.out.println(Arrays.toString(array));
    }

}
