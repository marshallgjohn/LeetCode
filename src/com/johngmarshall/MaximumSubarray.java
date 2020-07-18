package com.johngmarshall;

import java.util.Arrays;

public class MaximumSubarray {
    public static int sequence(int[] arr) {
        int m = 0, a = 0, s = 0;
        for(int e : arr) {
            s += e;
            m = Math.min(s, m);
            a = Math.max(a, s - m);
            System.out.printf("S: %d M: %d A: %d\n", s,m,a);
        }
        return a;
/*        if(Arrays.stream(arr).noneMatch(x -> x < 0)) {
            return Arrays.stream(arr).sum();
        } else if(Arrays.stream(arr).noneMatch(x -> x > 0)){
            return 0;
        }

        int x = 0;
        int sum = -9999999;
        for(int r=0;r<arr.length;r++) {
                for (int j = 0; j < arr.length-r; j++) {
                    int[] d = Arrays.copyOf(arr, arr.length-j);
                    if(Arrays.stream(d).skip(r).sum() > sum)
                    {
                        sum = Arrays.stream(d).skip(r).sum();
                    };
            }
        }
        return sum;*/
    }

    public static void main(String[] args) {
        System.out.println(sequence(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    }
}
