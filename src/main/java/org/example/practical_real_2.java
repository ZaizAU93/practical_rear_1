package org.example;
//В переменной n хранится двузначное число. Создайте программу, вычисляющую и
//выводящую на экран сумму цифр n.

public class practical_real_2 {
    public int n;

    public practical_real_2(int x){
        n = x;
    }
    public int colcul(int n){
        int buf;
        buf = n%10+n/10;
        return buf;
    }

}
