package com.johngmarshall;

public class BuildPileCubes {
    public static long findNb (long m) {
        long sum = 0;
        long count = 1;
        while(sum < m) {
            sum += count*count*count;
            count++;
        }
        if(sum != m) {
            count = 0;
        }

        return --count;
    }

    public static void main (String[] args) {
        System.out.println(findNb(4183059834009L));
    }
}
