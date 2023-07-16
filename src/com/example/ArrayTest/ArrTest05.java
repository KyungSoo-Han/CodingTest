package com.example.ArrayTest;

import java.util.Scanner;

public class ArrTest05 {
    public int solution(int n){
        int answer = 0;
        int[] ch = new int[n+1];    // 20을 입력할 경우 인덱스가 19까지만 생기므로 +1을 해줘야함;
        for (int i = 2; i < n; i++) {
            if(ch[i]==0){
                answer ++;
                for(int j=i; j<=n; j=j+i)
                    ch[j]=1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        ArrTest05 T = new ArrTest05();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        System.out.println("T.solution(n) = " + T.solution(n));
    }
}
