package org.example;

public class Main {
    public static void main(String[] args){
        System.out.println("Hello world!");

        int age = 29;

        System.out.println("Зайцев Андрей "+ age);

        // Первое домашнее задание
        practical_rear_1 Prac = new practical_rear_1();

        System.out.println("Результат выражения 4 * (b + c - 1) / 2 = " +Prac.calcul(10,2));

        practical_real_2 Prac2 = new practical_real_2(26);
        System.out.println("сумму цифр числа " + Prac2.n + " = "+Prac2.colcul(26));

    }
}