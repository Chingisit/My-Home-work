package ru.davletbaev.task3;

public class MultiTable {
    public static void main(String[] args) {
        int i,j;
        System.out.printf(" * |");
        for(i=1; i<11; i++)
            System.out.printf("%2d ", i);
        System.out.printf("\n---|------------");
        System.out.printf("----------------\n");
        for(i=1; i<11; i++)
        {
            System.out.printf("%2d |", i);
            for(j=1; j<11; j++)
                System.out.printf("%2d ", i*j);
            System.out.printf("\n");
        }

    }

}
