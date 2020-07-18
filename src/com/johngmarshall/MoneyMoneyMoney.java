package com.johngmarshall;

public class MoneyMoneyMoney {
    public static int calculateYears(double principal, double interest,  double tax, double desired) {
        int count = 0;
        while(principal < desired) {
            double add = principal*interest;
            principal += add - add*(tax);
            count++;
        }

        return count;


    }

    public static void main(String[] args) {
        System.out.println(calculateYears(1000,0.05,0.18,1100));
    }
}
