package com.example.StringTest;

import java.util.Scanner;

public class StringTest06 {

    public static void main(String[] args) {
        StringTest06 t = new StringTest06();
        Scanner kb = new Scanner(System.in);
        String str= kb.next();
        System.out.print("t.solution(str) = " + t.solution(str));
    }

    private String solution(String str) {
        String answer="";
        for (int i = 0; i < str.length(); i++) {
            //System.out.println(str.charAt(i)+" "+i+" "+str.indexOf(str.charAt(i)));
            if(str.indexOf(str.charAt(i)) == i)
                answer+=str.charAt(i);
        }
        return answer;
    }
}
