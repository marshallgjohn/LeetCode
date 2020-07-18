package com.johngmarshall;

import java.util.Arrays;

public class OddOrEven {
    public static String oddOrEven (int[] array) {

        return (array.length != 0) ? (Arrays.stream(array).sum() % 2 != 0) ? "odd" : "even" : "odd";
    }

    public static void main(String[] args) {
        System.out.println(oddOrEven(new int[] {2, 5, 34, 6}));
    }
}
