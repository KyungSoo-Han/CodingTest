package com.example;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
/*

        String val= "TESTA;;11AA";
        String s = new StringBuilder(val).reverse().toString();
        s = s.toUpperCase().replaceAll("[^A-Z]", "");
        System.out.println("s = " + s);
*/
        /*Character a1 = Character.valueOf('Z');
        String answer = "";
        String a = "Jackdaws love my big sphinx of quartz";
        //System.out.println("a.length() = " + a.lastIndexOf('a'));
        //System.out.println( a1 + 48-48);
        for(int i = 0; i<=25; i++){
            char ch = (char)(i+97);
            String as = String.valueOf(ch).toLowerCase();
            boolean contains = a.contains(as.toLowerCase());
            if(!contains){
                answer += as;
            }
        }
        System.out.println("answer = " + answer);*/

        int p = 2045;
        int answer = 0;
        for(int i = p+1; i<10000; i ++){

            List<Character> list = new ArrayList<>();
            int check = 0;
            char[] chars = String.valueOf(i).toCharArray();
            for (int j = 0; j < chars.length; j++) {
                char aChar = chars[j];

                if(list.contains(aChar))
                    check ++;

                list.add(aChar);
            }
            if(check == 0) {
                answer = i;
                break;
            }
        }
        System.out.println("answer = " + answer);
        System.out.println("answer = " + answer);
/*
        String answer = "6912";
        String a = "1111"; String b = "8889";
        Integer c = Integer.valueOf(a) + Integer.valueOf(b);

        answer = String.valueOf(c).substring(0,4);
        System.out.println("answer = " + answer);*/
    }
    boolean resultSts(int i){

        List<String> list = new ArrayList<>();
        int check = 0;
        String[] split = String.valueOf(i).split("");

        if(split.length == 4){
            for (int j = 0; j < split.length; j++) {
                String aChar = split[j];

                if(list.contains(aChar))
                    check ++;

                list.add(aChar);
            }
            if( check == 0)
                return true;
            else
                return false;
        }
        else
            return false;

    }
}
