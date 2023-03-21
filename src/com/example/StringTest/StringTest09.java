package com.example.StringTest;

import java.util.Scanner;

public class StringTest09 {

    /**
     * 아스키 코드를 이용해서
     * @param str
     * @return
     */
    public int solution(String str){
       int answer=0;
       for(char x : str.toCharArray()){
           if(x>=48 && x<=57)
               answer = answer*10+(x-48);
       }
        return answer;
    }

    /**
     * Character 클래스 이용
     * @param s
     * @return
     */
    public int solution2(String s){
        String answer="";
        for(char x : s.toCharArray()){
            if(Character.isDigit(x)) // 숫자인지 확인
                answer += x;
        }
        return Integer.parseInt( answer);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();

        StringTest09 test09= new StringTest09();
        System.out.println(test09.solution2(input));
    }

}
