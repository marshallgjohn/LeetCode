package com.johngmarshall;

import java.util.Arrays;
import java.util.stream.Collectors;

public class TheDeafRatsOfHamelin {
    public static int countDeafRats(final String town) {
        String[] lr = town.split("P");
        int count = 0;
        int length = 0;
        for(int i = 0; i < lr.length;i++) {
            if(lr[i].length() > 1) {
                int[] temp = new int[2];
                if (town.charAt(0) == 'P') {
                    temp = check(lr[1], count, length, "~", "O");
                } else if (i == 0) {
                    temp = check(lr[0], count, length, "O", "~");
                } else if (i == 1) {
                    temp = check(lr[1], count, length, "~", "O");
                }
                count = temp[0];
                length = temp[1];
            }
        }


        //System.out.printf("Count: %d, Length:%d",count/2,(length)/2);
        return count/2;
    }

    public static int[] check(String lr,int count, int l,String y,String z) {
        int length = l;
        lr = lr.replaceAll(" ","");
        boolean t = false;
        for (String x : lr.split("")) {
            if(t) {
                t=!t;
                continue;
            }
            length++;
            if (x.equals(y)) {
                count++;
            } else if (count % 2 == 1 && x.equals(z)) {
                count++;
            } else {
                t=!t;
            }
        }
        return new int[]{count,length};
    }

    public static void main(String[] args) {
        System.out.println(countDeafRats("~O~O~O~OP~O~OO~"));
    }
}
