package com.johngmarshall;

import javax.print.attribute.IntegerSyntax;
import java.util.ArrayList;
import java.util.Arrays;

public class Snail {
    public static int[] snail(int[][] array) {
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> arrRet = new ArrayList<>();

        for(int i = 0; i < array.length;i++) {
            for(int j = 0; j < array[i].length;j++) {
                arr.add(array[i][j]);
            }
        }
        int counter = 1;
        int length = array[0].length;
        boolean flip = true;
        while(arr.size() > 0)
        {
            //Checks for forward or backwards operation
            if(flip) {
                for (int i = 0; i < length; i++) {
                    arrRet.add(arr.remove((0)));
                }
                if(arr.size() > 0) {
                    for (int i = (arr.size() / 2) - 2; i < arr.size(); i += (arr.size() / 2) - 2) {
                        arrRet.add(arr.remove(i - counter));
                    }
                    counter++;
                } else {
                    break;
                }
            } else {
                counter=0;
                length--;
                for (int i = length; i > 0; i--) {
                    arrRet.add(arr.remove(arr.size()-1));
                }
                for(int i = arr.size()-1; i > 0; i-=(arr.size() / 2)-1) {
                    arrRet.add(arr.remove(i-counter));
                    counter++;
                }
            }

            flip = !flip;
        }
        
        System.out.println(Arrays.toString(arrRet.toArray()));
        return null;
    }

    public static void main(String[] args) {
        snail(new int[][] {
                {1,2, 3,  4},
                {12,13,14,5},
                {11,16,15,6},
                {10,9, 8,7}});
    }
}
