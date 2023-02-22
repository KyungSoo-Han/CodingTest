package com.example.StringTest;

import java.util.Scanner;

public class StringTest05 {
    public static void main(String[] args) {

        StringTest05 t = new StringTest05();
        Scanner kb = new Scanner(System.in);
        String str= kb.next();
        System.out.println("t.solution(str) = " + t.solution(str));
    }

    private String solution(String str) {
        String answer;
        char[] s = str.toCharArray();
        int lt = 0, rt = str.length() - 1 ;
        while (lt<rt){
            if(!Character.isAlphabetic(s[lt]))
                lt++;
            else if (!Character.isAlphabetic(s[rt]))
                rt--;
            else{
                char tmp=s[lt];
                s[lt]=s[rt];
                s[rt]=tmp;
                lt++;
                rt--;
            }
        }
        answer=String.valueOf(s);
        return answer;
    }

}
