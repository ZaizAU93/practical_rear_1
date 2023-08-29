package org.example;
//В переменной n хранится трёхзначное число. Создайте программу, вычисляющую и
//выводящую на экран сумму цифр n

public class practical_real_3 {
    int n;

    public practical_real_3(int n){
        this.n = n;
    }
    public int colcul(){
        int hundred = n/100;
        int remainder = n%100;
        //practical_real_2 Biweekly_number = new practical_real_2(remainder);
        //int res = Biweekly_number.colcul(n);

        int res = hundred+remainder%10+remainder/10;

        return res;
    }
}
