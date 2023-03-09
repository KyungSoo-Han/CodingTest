package com.example.StringTest;

import java.util.Scanner;

/**
 * 대소문자 변환
 */
public class StringTest02 {
    public static void main(String[] args) {
        StringTest02 T = new StringTest02();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println("T.solution(str) = " + T.solution(str) );
    }

    private String solution(String str) {
        String answer="";
        /*for (char x : str.toCharArray()) {
            if(Character.isLowerCase(x))
                answer += Character.toUpperCase(x);
            else
                answer += Character.toLowerCase(x);
        }*/

        // 대문자 A는 65부터, 소문자 a는 97부터
        for (char x : str.toCharArray()) {
            if(x>=97 && x<=122)
                System.out.println("x = " + x);
            if(x>=97 && x<=122) answer +=(char)(x-32);
            else answer+=(x+32);
        }
        return answer;
    }
}
