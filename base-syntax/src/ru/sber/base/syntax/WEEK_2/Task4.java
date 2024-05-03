package ru.sber.base.syntax.WEEK_2;

import java.util.Scanner;

public class Task4 {
    public static void main(String args[]){
        System.out.println("Введите число для проверки его на простоту: ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        if(number < 2) {
            System.out.print("Число не является простым");
        }

        for (int i=2;i<=number/2;i++) {
            if (number % i == 0) {
                System.out.println("Нет");
                break;
            } else {
                System.out.println("Да");
                break;
            }
        }
    }
}