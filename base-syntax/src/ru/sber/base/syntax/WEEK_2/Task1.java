package ru.sber.base.syntax.WEEK_2;

import java.util.Scanner; //Импорт сканнера
public class Task1 {
    public static void main(String args[]){
        System.out.println("Hello, world!");
        Scanner scan = new Scanner(System.in);
        System.out.println("What's ur name?");
        String UserName = scan.next();
        System.out.println ("Hello, " + UserName + "!");
    }
}
