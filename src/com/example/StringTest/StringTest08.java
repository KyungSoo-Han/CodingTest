package com.example.StringTest;

import java.util.Locale;
import java.util.Scanner;

/**
 * 팰린드롬
 */
public class StringTest08 {

    public String solution(String s){
        String answer = "NO";
        s = s.toUpperCase().replaceAll("[^A-Z]", "");
        String tmp = new StringBuilder(s).reverse().toString();
        if(s.equals(tmp))
            answer="YES";

        return answer;
    }

    public static void main(String[] args) {
        StringTest08 test08 = new StringTest08();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.println(test08.solution(str));
    }
}
