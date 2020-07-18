package com.johngmarshall;

import java.util.*;

public class PrimesInNumbers {
    public static String factors(int n) {
        int prime = 2;
        LinkedHashMap<Integer,Integer> set = new LinkedHashMap<>();
        while (n != 1) {
            if(n % prime == 0) {
                if(!set.containsKey(prime)) {
                    set.put(prime,1);
                } else {
                    set.put(prime, set.get(prime) + 1);
                }
                n /= prime;
            } else {
                prime = nextPrime(prime);
            }
        }
        return expandPrime(set);
    }

    public static String expandPrime (LinkedHashMap<Integer,Integer> set) {
        Iterator it = set.entrySet().iterator();
        StringBuilder sb = new StringBuilder();
        while(it.hasNext()) {
            Map.Entry element = (Map.Entry)it.next();
            if((int)element.getValue() > 1) {
                sb.append(String.format("(%d**%d)",(int)element.getKey(),(int)element.getValue()));
            } else {
                sb.append(String.format("(%d)",(int)element.getKey()));
            }
        }

        return sb.toString();
    }

    public static int nextPrime(int n) {
        boolean x = false;
        while(!x) {
            n++;
            x = isPrime(n);
        }
        return n;
    }

    public static boolean isPrime(int n) {
        if (n%2==0) return false;
        for(int i=n;i<=Math.sqrt(n);i+=2) {
            if(n%i==0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(factors(52946526));
    }
}
