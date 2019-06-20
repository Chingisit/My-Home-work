package ru.davletbaev.task16;

public class ArrayToLeft {

    private static final int[][] array = {
            {4, 7, 9, 6, 14, 74, 43},
            {67, 87, 3, 76, 55, 21, 12}
    };

    public static void main(String[] args) {
        showArray();
        toLeft();
        showArray();
    }

    private static void toLeft() {
        for (int i = 0; i < array.length ; i++) {
            for (int j = 0; j < array[i].length-1; j++) {
                int temp = array[i][j];
                array[i][j] = array[i][j + 1];
                array[i][j + 1] = temp;
            }
            array[i][array[i].length - 1] = 0;
        }
    }

    private static void showArray() {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

}
