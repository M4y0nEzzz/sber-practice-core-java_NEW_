package ru.sber.base.syntax;

public class Current_Directory {
    public static void main(String[] args) {
        String currentDir = System.getProperty("user.dir");
        System.out.println("Текущая рабочая директория: " + currentDir);
    }
}
