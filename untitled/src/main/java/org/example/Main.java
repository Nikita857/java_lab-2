package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        game();
    }

    //    Задание 1
    public static String isLeap() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите год в формате уууу");
        int year = in.nextInt();
        if ((year % 4 == 0) && year % 100 != 0) {
            return "В этом году 366 дней";
        } else if ((year % 4 == 0) && (year % 100 == 0) && (year % 400 == 0)) {
            return "В этом году 366 дней";
        } else {
            return "В этом году 365 дней";
        }
    }

    // Задание 2
    public static void game() {
        Scanner in = new Scanner(System.in);

        int counter = 0;

        while (true) {
            System.out.println("Введите количество дней");
            int days = in.nextInt();

            System.out.println("Введите год");
            int year = in.nextInt();

            if ((year % 4 == 0) && year % 100 != 0 && days == 366) {
                System.out.println("Правильно");
                counter++;
            } else if ((year % 4 == 0) && (year % 100 == 0) && (year % 400 == 0) && days == 366) {
                System.out.println("Правильно");
                counter++;

            } else if ((!(year % 4 == 0) && !(year % 100 == 0) && !(year % 400 == 0)) && days == 365) {
                System.out.println("Правильно");
                counter++;

            } else if ((year % 4 == 0) && year % 100 != 0 && days == 365) {
                System.out.println("Ошибка");
                break;
            } else {
                System.out.println("Ошибка");
                break;
            }

            System.out.println("Правильных ответов" + " " + counter);

        }


    }

    public static void array(){
        int[] Array = new int[100];
        for(int i = 0; i<100; i++){
           Array [i] = i;
            System.out.println("Array"+"["+i+"]"+"=>"+Array[i]);
        }

    }



}


