package org.example;
//В переменных q и w хранятся два натуральных числа. Создайте программу, выводящую
//на экран результат деления q на w с остатком. Пример вывода программы (для случая,
//когда в q хранится 21, а в w хранится 8): 21 / 8 = 2 и 5 в остатке

public class practical_real_5 {
    int q;
    int w;

    public practical_real_5(int q, int w){
        this.q = q;
        this.w = w;
    }

    public void division (){
        float res_1 = q%w;
        float res_2 =q/w;
        System.out.println(q + "/" + w + " = " + res_2 + " и "+ res_1);
    }

}
