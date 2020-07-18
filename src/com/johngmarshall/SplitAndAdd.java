package com.johngmarshall;

import java.util.ArrayList;
import java.util.Arrays;

public class SplitAndAdd {
/*
    public static int[] splitAndAdd(int[] numbers, int n) {
        if(numbers.length == 1 || n==0) {
            return numbers;
        }
        int arrLength = numbers.length/2; //4
        int arr2Length = numbers.length - arrLength; //4
        int[] arr = new int[arr2Length];
        if(arrLength != arr2Length) {
            arr[0] = numbers[arr2Length-1];
            for(int i = 0; i < arr2Length-1;i++)
            {
                arr[i+1] = (numbers[arr2Length+i] + numbers[i]);
            }
        } else {
            for(int i = 0; i < arr.length;i++) {
                arr[i] = (numbers[i] + numbers[i+arr.length]);
            }
        }
        return (splitAndAdd(arr, --n));
    }
*/

    public static int[] splitAndAdd(int[] numbers, int n) {
        int[] arr = Arrays.copyOf(numbers,numbers.length);
        while(arr.length > 1 && n-- > 0) {

        }
    return null;
    }

    public static void main(String[] args) {
        int[] arr = splitAndAdd(new int[]{15},3);
        for(int i = 0; i < arr.length;i++) {
            System.out.println(arr[i]);
        }
    }
}
