package ru.davletbaev.task11;

import java.io.File;

public class RecursiveMain {
    static int i = 0;

    public static void main(String[] args) {

        String path = "src/ru/davletbaev";
        recursiveWalk(path);
    }

    public static void recursiveWalk(String path) {
        File file = new File(path);
        File[] files = file.listFiles();

        if (files == null)
            return;

        for (File f : files ) {
            if (f.isDirectory()) {
                System.out.println(f.getPath());
                recursiveWalk(f.getPath());
            } else {
                System.out.println(f.getPath());
            }
        }

    }

    private static void takeRecurce(File file) {
        File[] files = file.listFiles();

        String string = "";
        for (int ii = 0; ii < i; ii++){
            string = string + "    ";
        }

        for (File file1 : files) {
            if (file1.isFile()) {
                System.out.println(string + file1.getName());
            } else {
                System.out.println(string + file1.getName());
                i++;
                takeRecurce(file1);
                i--;

            }
        }
    }
}
