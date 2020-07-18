package com.johngmarshall;

public class BouncingBalls {
    public static int bouncingBall(double h, double bounce, double window) {
        if (bounce > 0 && bounce < 1 && h > 0 && h > window) {
            int count = 0;
            while (h > window) {
                if (count % 2 == 0) {
                    count++;
                } else {
                    count += 2;
                }
                h *= bounce;
            }
            return count;
        }
        else {
            return -1;
        }
    }

    public static void main(String[] args) {
        System.out.println(bouncingBall(30.0, 0.66, 1.5));
    }
}
