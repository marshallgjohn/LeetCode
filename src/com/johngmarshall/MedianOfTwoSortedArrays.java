package com.johngmarshall;

public class MedianOfTwoSortedArrays {

    public static double findMedian(int[]nums1,int[] nums2) {
        double num = nums1.length + nums2.length;
        if (num%2 == 0) {
            return ((num/2)+((num/2)+1))/2;
        } else {
            return Math.round(num/2);
        }

    }

    public static void main(String[] args) {
        System.out.println(findMedian(new int[]{1,4,2},new int[]{3,4,6}));
    }
}
