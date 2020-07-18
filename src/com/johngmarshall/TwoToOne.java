package com.johngmarshall;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class TwoToOne {
    public static String longest (String s1, String s2) {
        return Arrays.stream((((s1 + s2).replaceAll("(.)(?=.*\\1)","")).split("")))
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.joining(""));
    }

    public static void main (String[] args) {
        System.out.println(longest("abf","ecdd"));
    }
}
