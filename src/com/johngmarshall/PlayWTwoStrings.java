package com.johngmarshall;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class PlayWTwoStrings {
    public static String workOnStrings(String a, String b) {
        return runThruStrings(b,a)+runThruStrings(a,b);
    }

    public static String runThruStrings(String first, String second) {
        for(char x: first.toCharArray()) {
            int count = first.length() - first.toLowerCase().replace(String.valueOf(x).toLowerCase(), "").length();
            if(count % 2 != 0 && second.toLowerCase().contains(String.valueOf(x).toLowerCase())) {
                second = flipCase(second,x);
            }
        }
        return second;
    }

    public static String flipCase(String s, char c) {
        for(int i = 0;i < s.length();i++) {
            if(String.valueOf(s.charAt(i)).toLowerCase().equals(String.valueOf(c).toLowerCase())) {
                if(Character.isLowerCase(s.charAt(i))) {
                    s = s.substring(0,i) + String.valueOf(c).toUpperCase() + s.substring(i+1);
                } else {
                    s = s.substring(0,i) + String.valueOf(c).toLowerCase() + s.substring(i+1);
                }
            }
        }
        return s;
    }


    public static void main(String[] args) {
        System.out.println(workOnStrings("abcdeFgtrzw", "defgGgfhjkwqe"));
    }
}


/*
    String first = a;
    String second = b;
    int tipper = 0;
        for(char x: first.toCharArray()) {
                int count = first.length() - first.toLowerCase().replace(String.valueOf(x).toLowerCase(),"").length();
                if (count % 2 != 0) {
                for(int i = 0;i<second.length() - second.toLowerCase().replaceAll(String.valueOf(x).toLowerCase(),"").length();i++) {
        char replace = b.charAt(tipper);
        if (Character.isLowerCase(replace)) {
        String d = String.valueOf(replace);
        b = b.replace(String.valueOf(replace), String.valueOf(replace).toUpperCase());
        } else {
        String d = String.valueOf(replace).toLowerCase();
        String s = b.replace(d, String.valueOf(replace).toUpperCase());
        b = b.replace(d, String.valueOf(replace).toUpperCase());
        }

        tipper++;
        }
        } else {

        }
        }

        for(char x: second.toCharArray()) {
        int count = second.length() - second.toLowerCase().replaceAll(String.valueOf(x).toLowerCase(),"").length();
        if (count % 2 != 0) {
        if(Character.isLowerCase(x)) {
        a = a.replaceAll(String.valueOf(x),String.valueOf(x).toUpperCase());
        } else {
        a = a.replaceAll(String.valueOf(x),String.valueOf(x).toLowerCase());
        }
        };
        }

        System.out.println(a+b);*/
