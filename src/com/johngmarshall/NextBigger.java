package com.johngmarshall;

import java.util.Arrays;

public class NextBigger {
    public static long nextBiggerNumber(long n)
    {
/*        System.out.println(n);
        String num = String.valueOf(n);
        int length = num.length();
        if(num.length() == 1) {return -1;}
        long flippedNum = -1;
        while(flippedNum < n) {
            flippedNum = Long.parseLong(num.substring(0,length-2) + num.substring(length-1,length)+num.substring(length-2,length-1) + num.substring(length));
            length--;
        }
        return (flippedNum > n) ? flippedNum:-1;*/

/*        String num =String.valueOf(n);
        if(num.length() == 1) {return -1;}
        String temp;
        while(true) {
            n++;
            //System.out.println(n);
            temp = String.valueOf(n);
            for(Character x: num.toCharArray()) {
                temp = temp.replaceFirst(String.valueOf(Long.parseLong(String.valueOf(x))),"");
            }
            if(temp.length() == 0) {
                return n;
            }
        }*/
    return 0;

    }

    public static void main(String[] args) {
        System.out.println(nextBiggerNumber(998977544));
    }
}
