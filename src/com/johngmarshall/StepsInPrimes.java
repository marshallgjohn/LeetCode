package com.johngmarshall;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class StepsInPrimes {
    public static long[] step(int g, long m, long n) {
        for(long i = m; i < n;i++) {
            if(isPrime(i)) {
                if(isPrime(i-g) && i-g >= m) {
                    return new long[]{i-g,i};
                }
            }
        }
        return null;
    }


    public static boolean isPrime(long n) {

        if (n%2==0) return false;
        for(long i=3;i<=Math.sqrt(n);i+=2) {
            if(n%i==0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.stream(step(6,100,110)).mapToObj(String::valueOf).collect(Collectors.joining(",")));
    }
}
