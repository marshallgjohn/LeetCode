package com.johngmarshall;

import java.util.ArrayList;

public class SumOfDigits {
    public static int digital_root(int n) {
        int sum = 0;
        char[] c = String.valueOf(n).toCharArray();
        for (char num : c) {
            sum += Integer.parseInt(String.valueOf(num));
        }

        while(sum / 10.0 > 1) {
            c = String.valueOf(sum).toCharArray();
            sum = 0;
            for (char num : c) {
                sum += Integer.parseInt(String.valueOf(num));
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(digital_root(942));
    }
}
