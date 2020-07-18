package com.johngmarshall;

import java.util.Arrays;

public class NoOneLikesCarryingChange {
    public static int solve(int amount, int[] coinAmounts) {
        int count = 0;
        coinAmounts = Arrays.stream(coinAmounts).sorted().toArray();
        for(int i = coinAmounts.length-1;i > -1; i--) {
            if(amount % coinAmounts[i] != amount || amount != 0) {
                count += amount / coinAmounts[i];
                amount = amount % coinAmounts[i];
            } else if (amount==0) {
                return count;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] coins1={1,5,10,25};
        int[] coins2={1,2,5,10,20,50};
        int[] coins3={1, 12, 2, 4};
            System.out.println(solve(1960,coins3));
    }
}
