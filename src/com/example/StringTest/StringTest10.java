package com.example.StringTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringTest10 {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        char c = in.next().charAt(0);

        StringTest10 T = new StringTest10();
        for (int i : T.solution(s,c)) {
            System.out.print(i + " ");
        }
    }

    private int[] solution(String s, char c) {
        int[] answer = new int[s.length()];
        int p = 1000;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                p = 0;
            } else {
                p++;
            }
            answer[i] = p;
        }
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == c) {
                p = 0;
            } else {
                p++;
                if (answer[i] > p)
                    answer[i] = p;
                // answer[i] = Math.min(answer[i], p);
            }
        }

        return answer;
    }
}
