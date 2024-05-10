package ru.sber.base.syntax.WEEK_9;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Del_Excess_Spaces {
    public static void main(String[] args) {
        File inputFile = new File("Borodino.txt");
        File outputFile = new File("Borodino_cleaned.txt");

        try (Scanner scanner = new Scanner(inputFile, StandardCharsets.UTF_8);
             PrintWriter writer = new PrintWriter(new FileWriter(outputFile, StandardCharsets.UTF_8))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                // Убираем лишние пробелы здесь:
                String cleanedLine = line.trim().replaceAll("\\s+", " ");
                writer.println(cleanedLine);
            }
            System.out.println("Файл успешно обработан и сохранен как Borodino_cleaned.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
