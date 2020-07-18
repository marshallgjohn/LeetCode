package com.johngmarshall;

public class LongestPalindromicString {

    public static String longestPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        sb.reverse();

        String palin = "";

       for(int i = 0; i < s.length();i++) {
           if(s.charAt(i)==sb.charAt(i)) {
               palin += s.charAt(i);
           } else {

           }
       }



        return null;
    }


    public static void main(String[] args) {
        System.out.println(longestPalindrome("abcb"));
    }
}
