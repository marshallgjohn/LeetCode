package com.johngmarshall;

import java.util.Arrays;
import java.util.stream.Collectors;

public class JadenCasingStrings {
    public static String toJadenCase(String phrase) {
        return (phrase != null && !phrase.isEmpty()) ? Arrays.stream(phrase.split(" ")).map(item -> String.format("%s%s",item.substring(0,1).toUpperCase(),item.substring(1))).collect(Collectors.joining(" ")) : null;
    }

    public static void main(String[] args) {
        System.out.println(toJadenCase(null));
    }
}
