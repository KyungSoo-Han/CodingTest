package com.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test01 {
    public static void main(String[] args) throws Exception {

        String input  = "4000 30 30000";
        String[] s = input.split(" ");

        double a1 = Double.parseDouble(s[0]);
        double a2 = Double.parseDouble(s[1]);
        double a3 = Double.parseDouble(s[2]);
        int b1 = 0;
        int b2 = 0;

        if (a1 >= 1200 && a1 <= 4599){
            b1 = 15; b2=108;
        }else if (a1>=4600 && a1 <=8799){
            b1 = 24; b2=522;
        }else if (a1>=8800 && a1<=14999){
            b1 = 35; b2=1490;
        }else if (a1>=15000 &&  a1<=30000){
            b1 = 38; b2=1940;
        }

        int salary = (int) Math.floor(((a1 * (100 - b1)/ 100) / 12 ) + (b2 / 12));
        int value = 0;
        int count =1;

        System.out.println((int) Math.floor(salary * (a2 /100)) );
        do{
            if(count%12 ==0 ) {
                System.out.println("=====");
                System.out.println(salary + (int) Math.floor(salary * (5 / 100)));
                System.out.println(salary + (int) Math.floor(salary * (5 / 100)));
                salary = salary + (int) Math.floor(salary * (5 / 100));

            }

            value +=  (int) Math.floor(salary * (a2 /100)) ;

            System.out.println("salary = " + salary);
            System.out.println("value = " + value);
            count ++;
            System.out.println("count = " + count);

        }while(value <= a3);

        System.out.println("value = " + value);
        System.out.println("count = " + count);
    }

    static void charOrNumberCheck(String input){
        String str = "";
        String num = "";
        for(char x : input.toCharArray()){
            if(Character.isDigit(x))
                str += x;
            else
                num += x;
        }

        System.out.println(str + num);
    }
}
