package com.example.ArrayTest;

import java.util.Scanner;

public class ArrTest04 {

    public int[] solution(int n){
        int[] answer= new int[n];
        answer[0]=1;
        answer[1]=1;
        for (int i = 2; i < n; i++) {
            answer[i] = answer[i-2]+answer[i-1];
        }

        return answer;
    }

    public static void main(String[] args) {
        ArrTest04 test04 = new ArrTest04();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        for (int i : test04.solution(n)) {
            System.out.print( i + " ");
        }
    }
}
