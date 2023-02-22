package com.example.StringTest;

import java.util.ArrayList;
import java.util.Scanner;

public class StringTest04 {
    public static void main(String[] args) {
        StringTest04 t = new StringTest04();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        String[] str= new String[n];
        for(int i =0; i < n; i++){
            str[i] = kb.next();
        }
        System.out.println("t.solution(str) = " + t.solution2(n, str));

    }

    /**
     *   StringBuilder 공부!
     *   reverse() => 문자열 단순히 뒤집어 준다.
     */
    public ArrayList<String> solution(int n, String[] str){
        ArrayList<String> answer = new ArrayList<>();
        for (String x : str) {
            String tmp = new StringBuilder(x).reverse().toString();
            answer.add(tmp);
        }
        return answer;
    }

    /**     ->      <-
     *     //lt      rt
     *     //0 1 2 3 4
     *     //s t u d y
     *     //y d u t s <= lr와 rt로 문자 위치 변경
     *
     */
    public ArrayList<String> solution2(int n, String[] str){
        ArrayList<String> answer = new ArrayList<>();
        for (String x : str) {
            char[] s = x.toCharArray();
            int lt = 0, rt = x.length() - 1; // 인덱스 0부터 시작
            while(lt<rt){
                char tmp=s[lt];     // 첫번째 문자 저장
                s[lt]=s[rt];        // 오른쪽값 왼쪽으로 이동
                s[rt]=tmp;          // 왼쪽값 으론쪽으로 이동
                lt++;               // 왼쪽 탐색기 왼쪽에서 오른쪽으로 이동
                rt--;               // 오른쪽 탐색기 오른쪽에서 왼쪽으로 이동
            }
            String tmp = String.valueOf(s);     // 문자열로 변환
            answer.add(tmp);
        }
        return answer;
    }

}
