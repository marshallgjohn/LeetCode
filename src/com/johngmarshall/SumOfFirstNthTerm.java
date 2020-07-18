package com.johngmarshall;

public class SumOfFirstNthTerm {
    public static String seriesSum(int n) {
        double sum = 1.0;
        for(int i =4;i < (n*3);i+=3) {
            sum += (1.0 / i);
        }

        double round = Math.pow(10,2);
        return String.valueOf(Math.round(sum* round) /round);
    }

    public static void main(String[] args) {
        System.out.println(seriesSum(43));
    }
}
