package com.example.StringTest;

import java.util.Scanner;

/**
 * 문자 속 단어
 */
public class StringTest03 {
    public static void main(String[] args) {
        StringTest03 t = new StringTest03();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.println("t.solution(str) = " + t.solution2(str));

    }
    /*
        split를 사용
     */
    private String solution(String str) {
        String answer ="";
        int m = Integer.MIN_VALUE;
        String[] s = str.split(" ");
        for (String x : s) {
            System.out.println("x = " + x);

            //⬇️ 최대값 구하는 알고리즘
            int len = x.length();
            if(len>m){
                m=len;
                answer=x;
            }
        }
        return answer;
    }

    /*
        indexOf를 사용
     */
    private String solution2(String str){
        String answer ="";
        int m = Integer.MIN_VALUE, pos;
        while((pos=str.indexOf(' ')) != -1){
            String tmp = str.substring(0,pos);
            System.out.println("tmp = " + tmp);
            int len = tmp.length();
            if(len>m){
                m=len;
                answer=tmp;
            }
            str = str.substring(pos+1);
        }
        if(str.length()>m) answer = str;

        return answer;
    }
}
