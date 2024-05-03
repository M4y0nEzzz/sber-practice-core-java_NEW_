package ru.sber.base.syntax.WEEK_2;

import java.util.Scanner;
public class Task2 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите количество выводимых чисел : ");
        int number = scan.nextInt();
        if (number < 1 || number > 500){
            System.out.println("Введено недопустимое число" +
                    number + "Допустимый диапазон значений: 1 - 500");
        } else {
            for (int i=1;i<=number;i++){
                System.out.print(7*i + " ");
            }
        }
    }
}