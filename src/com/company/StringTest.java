package com.company;

import java.util.Locale;
import java.util.Scanner;

public class StringTest {
    public static void main(String[] args) {
        String s1 = "hello";

        String s2 = new String("hello");

        char hello[] = {'h', 'e', 'l', 'l', 'o'};
        String s3 = new String(hello);

        String s4 = new String(s1.getBytes());

        StringBuilder builder = new StringBuilder("hello");
        String s5 = builder.toString();

        System.out.println("Литерал -> " + s1 + "\n" + "New -> " + s2 + "\n" + "Массив символов -> " + s3 + "\n" + "Массив из байтов -> " + s4 + "\n" + "StringBuilder -> " + s5 + "\n");

        String s6 = "Апельсин,Яблоко,Гранат,Груша";
        String[] fruits = s6.split(",");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        String maxlength = "";
        for (String fruit : fruits) {
            if (maxlength.length() < fruit.length()) {
                maxlength = fruit;
            }
        }
        System.out.println("\n" + maxlength.toLowerCase() + "\n");

        String shortFruit = maxlength.toLowerCase().substring(0, 3);
        System.out.println(shortFruit + "\n");

        String s7 = "   Я_новая_строка      ";
        System.out.println(s7.trim().replace("_", " "));

        System.out.println("Введите текст -> ");
        Scanner sc = new Scanner(System.in);
        String s8 = sc.nextLine();
        if (s8.contains("Ошибка")) {
            System.out.println("Произошла ошибка");
        } else if (s8.startsWith("Запуск")) {
            if (s8.endsWith("Завершен")) {
                System.out.println("Запускаем процесс\n" + s8 + "\n" + "Процесс завершен");
            } else {
                System.out.println("Запускаем процесс\n" + s8);
            }
        } else if (s8.endsWith("Завершен")) {
            System.out.println(s8 + "\n" + "Процесс завершен");
        }

        StringBuilder builder2 = new StringBuilder(s1 + s2 + s3 + "\n" + s4 + s5 + s6 + "\n" + s7 + s8);
        String s9 = builder2.reverse().toString();
        System.out.println(s9);
    }
}