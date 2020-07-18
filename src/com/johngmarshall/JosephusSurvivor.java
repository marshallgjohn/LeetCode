package com.johngmarshall;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class JosephusSurvivor {
    public static int josephusSurvivor(final int n, final int k) {
        List<Integer> x = Arrays.stream(IntStream.range(1,n+1).toArray()).boxed().collect(Collectors.toList());

        int count = 0;
        while(x.size() > 1) {
            count =((count + k-1) % x.size());
            x.remove(count);

        }
        return x.get(0);
    }

    public static void main(String[] args) {
        System.out.println(josephusSurvivor(7,3));
    }
}
