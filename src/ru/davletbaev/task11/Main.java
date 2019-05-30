package ru.davletbaev.task11;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;

public class Main {

    public static final String PATH = "src/ru/davletbaev/task11";

    public static void main(String[] args) throws IOException {

        //создание нового файла
        String pathNewFile = PATH + File.separator + "newFile.txt";

        File newFile = new File(pathNewFile);
        if (newFile.createNewFile()) {
            System.out.println("Создан новый файл: " + newFile.getName());
        } else {
            newFile.delete();
            System.out.println("Удален: " + newFile.getName());
        }

        //записали в новый файл
        try(FileWriter writer = new FileWriter(pathNewFile)){
            String text = "Hello World!";
            writer.write(text);
            //запись символами
            writer.append('\n');
            writer.append('1');

            writer.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        //переименование файла
        String input = PATH + File.separator + "input.txt";
        String renameInput = PATH + File.separator + "rename_input.txt";
        if (new File(input).renameTo(new File(renameInput))) {
            System.out.println("Файл input.txt переименовали в rename_input.txt");
        };
        if (new File(renameInput).renameTo(new File(input))) {
            System.out.println("Файл rename_input.txt переименовали в input.txt");
        };

        //копириование файла
        String output = PATH + File.separator + "output.txt";
        try {
            Files.copy(Paths.get(input), Paths.get(output), REPLACE_EXISTING);
            System.out.println("Скопировали input.txt в output.txt");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
