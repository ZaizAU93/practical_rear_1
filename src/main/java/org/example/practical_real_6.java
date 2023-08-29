package org.example;
//Написать программу которая будет менять местами значение целочисленных
//переменных. Пример:
//int a = 1; int b = 2;
////код (ваше решение)
//sout(a); //выведет 2
//sout(b); //выведет 1

public class practical_real_6 {
    public int a;
    public int b;

    public practical_real_6(int a, int b){
        this.a = a;
        this.b = b;
    }

    public void castling (){
        System.out.println("Замена местами значений целочисленных переменных а = "+ a + " и b = "+b);
        a -= b;
        b+= a;
        a = b - a;
        System.out.println("                                                 а = "+ a + " и b = "+b);
    }

    public void castling_1 (){
        System.out.println("Замена местами значений целочисленных переменных а = "+ a + " и b = "+b);
        int buf;
        buf = a * b;
        b = buf / b;
        a = buf / b;
        System.out.println("                                                 а = "+ a + " и b = "+b);
    }

}
