package org.example;
//В переменной n хранится двузначное число. Создайте программу, вычисляющую и
//выводящую на экран сумму цифр n.

public class practical_real_2 {
    public int n;

    public practical_real_2(int n){
        this.n = n;
    }
    public int colcul(){
        int buf;
        buf = n%10+n/10;
        return buf;
    }

}
