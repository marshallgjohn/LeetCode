package com.johngmarshall;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;

public class mixbonacci {
    public static BigInteger[] mixbonacci(String[] pattern, int length) {
        HashMap<String, Integer> map = new HashMap<>();
        BigInteger[] ret = new BigInteger[length];
        for (int i = 0; i < length; i+=pattern.length) {
            for (int j = 0; j < pattern.length && i+j < length; j++) {
                if (!map.containsKey(pattern[j])) {
                    map.put(pattern[j], 0);
                }
                switch (pattern[j]) {
                    case "fib":
                        ret[i+j] = fib(map.get("fib"));
                        break;
                    case "pad":
                        ret[i+j] = pad(map.get("pad"));
                        break;
                    case "jac":
                        ret[i+j] = jac(map.get("jac"));
                        break;
                    case "pel":
                        ret[i+j] = pel(map.get("pel"));
                        break;
                    case "tri":
                        ret[i+j] = tri(map.get("tri"));
                        break;
                    case "tet":
                        ret[i+j] = tet(map.get("tet"));
                        break;
                }
                map.put(pattern[j], map.get(pattern[j]) + 1);
            }
        }
        return ret;
    }


    public static BigInteger fib(int n) {
        ArrayList<Long> f = new ArrayList<>();
        f.add(0L);
        f.add(1L);

        for (int i = 0; i < n; i++) {
            f.add(f.get(i) + f.get(i + 1));
        }
        return BigInteger.valueOf(f.get(n));
    }

    public static BigInteger tri(int n) {
        ArrayList<Long> f = new ArrayList<>();
        f.add(0L);
        f.add(0L);
        f.add(1L);

        for (int i = 0; i < n; i++) {
            f.add(f.get(i) + f.get(i + 1) + f.get(i + 2));
        }
        return BigInteger.valueOf(f.get(n));
    }

    public static BigInteger tet(int n) {
        ArrayList<Long> f = new ArrayList<>();
        f.add(0L);
        f.add(0L);
        f.add(0L);
        f.add(1L);

        for (int i = 0; i < n; i++) {
            f.add(f.get(i) + f.get(i + 1) + f.get(i + 2) + f.get(i + 3));
        }
        return BigInteger.valueOf(f.get(n));
    }

    public static BigInteger jac(int n) {
        ArrayList<Long> f = new ArrayList<>();
        f.add(0L);
        f.add(1L);

        for (int i = 0; i < n; i++) {
            f.add(2 * f.get(i) + f.get(i + 1));
        }
        return BigInteger.valueOf(f.get(n));
    }

    public static BigInteger pad(int n) {
        ArrayList<Long> f = new ArrayList<>();
        f.add(1L);
        f.add(0L);
        f.add(0L);

        for (int i = 0; i < n; i++) {
            f.add(f.get(i) + f.get(i + 1));
        }
        return BigInteger.valueOf(f.get(n));
    }

    public static BigInteger pel(int n) {
        ArrayList<Long> f = new ArrayList<>();
        f.add(0L);
        f.add(1L);

        for (int i = 0; i < n; i++) {
            f.add(f.get(i) + 2L* f.get(i+1));
        }
        return BigInteger.valueOf(f.get(n));
    }

    public static void main(String[] args) {
        //System.out.println(mixbonacci(new String[]{}, 0).toString());
        for(BigInteger x: mixbonacci(new String[]{"jac", "jac", "pel","jac", "jac", "pel"},  200)) {
            System.out.println(x);
        }
    }
}
