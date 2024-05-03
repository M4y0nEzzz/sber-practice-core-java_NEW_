package ru.sber.base.syntax.WEEK_2;

import java.util.Scanner;
public class Task7 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите a= ");
        int a = scan.nextInt();
        System.out.println("Введите b= ");
        int b = scan.nextInt();
        System.out.println("Введите c= ");
        int c = scan.nextInt();

        System.out.println("Решим квадратное уравнение ax^2 + bx + c = 0");
        double D = b*b - 4*a*c;
        System.out.println("Дискриминант: " + D);
        if (D < 0){
            System.out.println("Корней нет");
        }
        else if (D == 0){
            System.out.println("X = " + (-b/(2*a)));
        }
        else{
            System.out.println("X1 = " + ((-b + Math.sqrt(D)) / (2*a)));
            System.out.println("X2 = " + ((-b - Math.sqrt(D)) / (2*a)));
        }
    }
}