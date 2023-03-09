package com.example.StringTest;

import java.util.Scanner;

public class StringTest07 {

    public String solution(String str){
        String answer = "YES";
        //str = str.toUpperCase();  // 대문자로 변환

        int len = str.length();
        for(int i=0; i<len/2; i++){
            if(str.charAt(i)!=str.charAt(len-i-1))
                return "NO";
        }
        return answer;
    }

    public String solution2(String str){
        String answer = "NO";
        String tmp = new StringBuilder(str).reverse().toString();
        if(str.equals(tmp))     //if(str.equalsIgnoreCase(tmp)) // 대소문자 구분 안함
            return "YES";
        return answer;
    }

    public static void main(String[] args) {
        StringTest07 test07 = new StringTest07();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();

        System.out.println("test07.solution(str) = " + test07.solution(str));
        System.out.println("test07.solution2(str) = " + test07.solution2(str));
    }

}
