package ru.davletbaev.task12;

import java.io.*;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Random;

public class Main {
    private static final String fileName = "src/ru/davletbaev/task12/Library.bin";

    public static void main(String[] args) throws Exception {
        Book book = addBook();
        write(book);

        Library library = load();

        System.out.println("Before: \n" + book);
        System.out.print("After: \n");
        Arrays.stream(library.getBooks()).filter(b -> b != null).forEach(System.out::println);
    }

    private static Book addBook() {
        Book bk = new Book();
        bk.setBookName("Гарри Потер");
        bk.setAuthor("Джоан Роулинг");
        bk.setMadeYear(getYear());

        return bk;

    }

    private static void write(Book book) throws IOException {

        File file = new File(fileName);
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;

        try {
            if ( file.exists() ) {
                fos = new FileOutputStream(file, true);
                oos = new AppendingObjectOutputStream(fos);
            } else {
                fos = new FileOutputStream(file, true);
                oos = new ObjectOutputStream(fos);
            }
            oos.writeObject(book);

        } finally {
            oos.close();
            fos.close();
        }
    }

    private static Library load() throws IOException, ClassNotFoundException {

        FileInputStream fis = new FileInputStream(fileName);
        ObjectInputStream ois = new ObjectInputStream(fis);

        Book[] books = new Book[100];
        Library library = new Library();
        int i = 0;
        try {
            while (fis.available() != 0) {
                Book book = (Book) ois.readObject();
                books[i] = book;
                i++;
            }
            library.setBooks(books);
        } finally {
            ois.close();
            fis.close();
        }

        return library;
    }

    private static LocalDate getYear() {
        Random random = new Random();
        int minDay = (int) LocalDate.of(1900, 1, 1).toEpochDay();
        int maxDay = (int) LocalDate.of(2015, 1, 1).toEpochDay();
        long randomDay = minDay + random.nextInt(maxDay - minDay);

        return LocalDate.ofEpochDay(randomDay);
    }

}
