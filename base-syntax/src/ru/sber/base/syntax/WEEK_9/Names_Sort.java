package ru.sber.base.syntax.WEEK_9;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;


public class Names_Sort {
    public static void main(String[] args) {
        File inputFile = new File("listNames.txt");
        File outputFile = new File("sortedNames.txt");

        try {
            // Чтение имен из файла
            List<String> names = new ArrayList<>(Arrays.asList(
                    "Сергей", "Мария", "Анна", "Валерий", "Анастасия",
                    "Павел", "Иван", "Яна", "Дарья", "Ксения", "Андрей"
            ));

            // Сортировка имен
            Collections.sort(names);

            // Запись отсортированных имен в новый файл
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
                for (String sortedName : names) {
                    writer.write(sortedName);
                    writer.newLine();
                }
            }

            System.out.println("Отсортированный список имен сохранен в файл " + outputFile);

        } catch (IOException e) {
            System.out.println("Произошла ошибка при работе с файлами: " + e.getMessage());
        }
    }
}