package com.johngmarshall;

import java.util.*;

public class JosephusPermutation {
/*
    public static <T> List<T> josephusPermutation(final List<T> items, final int k) {
        if(k==1 || items.size()==0){
            return items;
        }
        List<T> list = new ArrayList<>();
        ArrayList<T> temp = new ArrayList<>(items);
        int count = 2;
        int test = items.size();
        list.add(items.get(k-1));
        temp.remove(items.get(k-1));
        while(count != test) {
            int add = ((k)*count)-1;
            if(add >= items.size())
            {
                items.addAll(temp);
            }
            if (test==count+1) {
                items.addAll(temp);
            }
            list.add(items.get(add));
            if(items.get(add) instanceof Integer) {
                temp.remove(Integer.valueOf((int) items.get(add)));
            } else {
                temp.remove(items.get(add));
            }
            count++;
        }
        list.add(temp.get(0));
        System.out.println(items);
        return list;
    }
*/

    public static Collection<Object> josephusPermutation(final List<Object> items, final int k) {
        Collection<Object> permutation = new ArrayList<Object>();
        int position = 0;
        while(items.size() > 0) {
            position = (position + k - 1) % items.size();
            permutation.add(items.remove((int) position));
        }
        return permutation;
    }

    public static void main(String[] args) {
        System.out.println(josephusPermutation(new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)),2));
    }
}
