package ru.davletbaev.task13;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
    public static final String PATH = "src/ru/davletbaev/task13";

    public static void main(String[] args) throws IOException {

        //создание нового файла
        String pathNewFile = PATH + File.separator + "input.txt";

        File newFile = new File(pathNewFile);
        if (newFile.createNewFile()) {
            System.out.println("Создан новый файл: " + newFile.getName());
        } else {
            newFile.delete();
            System.out.println("Удален: " + newFile.getName());
        }

        //записали в новый файл
        try (FileWriter writer = new FileWriter(pathNewFile)) {
            String text = "Hello World!";
            writer.write(text);

            writer.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
            File f1 = new File("src/ru/davletbaev/task13/input.txt");
            File f2 = new File("src/ru/davletbaev/task13/output.txt");

            int a;
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(f2), StandardCharsets.UTF_8));
            FileReader fr = new FileReader(f1);
            while ((a = fr.read()) != -1) bw.write(a);
            fr.close();
            bw.close();
        }

    }
