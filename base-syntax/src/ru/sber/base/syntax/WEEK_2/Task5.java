package ru.sber.base.syntax.WEEK_2;

import java.util.Scanner;
public class Task5 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите количество выводимых чисел: ");

        int number = scan.nextInt();
        if (number < 2 || number > 1000){
            System.out.println("Введено недопустимое число" +
                    number + "Допустимый диапазон значений: 2 - 1000");
        }
        int[] myVar = new int[number];
        myVar[0] = 0;
        myVar[1] = 1;
        for (int i = 2; i < myVar.length; ++i) {
            myVar[i] = myVar[i - 1] + myVar[i - 2];
        }
        for (int i = 0; i < myVar.length; ++i) {
            System.out.println(myVar[i]);
        }
    }
}

