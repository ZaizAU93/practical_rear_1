package org.example;

//В переменной n хранится вещественное число с ненулевой дробной частью. Создайте
//программу, округляющую число n до ближайшего целого и выводящую результат на
//экран

public class practical_real_4 {
    public double n;

    public practical_real_4(double n) {
        this.n = n;
    }

    public int rounding(){

        int x = (int) Math.round(this.n);
        return x;
    }
}
