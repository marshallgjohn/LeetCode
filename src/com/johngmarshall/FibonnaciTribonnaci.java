package com.johngmarshall;

import java.util.ArrayList;
import java.util.Arrays;

public class FibonnaciTribonnaci {
    public static double[] tribonacci(double[] s, int n) {
        if(n==0) {
            return new double[]{};
        }

        double num = 0;
        double count = 0;
        double[] currentTerms = s;
        ArrayList<Double> test = new ArrayList<>();
/*        test.add(s[0]);
        test.add(s[1]);
        test.add(s[2]);*/
        while(count < n) {
            for (int i = 0; i < 3; i++) {
                num+=currentTerms[i];

            }
            currentTerms= new double[]{currentTerms[1],currentTerms[2],num};
            test.add(num);
            num=0;
            count++;
        }

        System.out.println(test);
        double[] arr = new double[test.size()];
        for(int i = 0; i < arr.length;i++) {

            arr[i] = test.get(i);
        }

        return arr;
    }

    public static void main(String[] args) {
        System.out.println(tribonacci(new double []{1,1,1},2));
    }
}
