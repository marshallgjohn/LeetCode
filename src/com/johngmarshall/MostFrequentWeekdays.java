package com.johngmarshall;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class MostFrequentWeekdays {
    public static String[] mostFrequentDays(int year) {
        HashMap<Integer,Integer> holder = new HashMap<>();
        LocalDate days = LocalDate.of(year,1,1);
        int count = 0;
        while(days.plusDays(count).getYear() == year) {
            LocalDate currentDate = days.plusDays(count);
            if(!holder.containsKey(currentDate.getDayOfWeek().getValue())) {
                holder.put(currentDate.getDayOfWeek().getValue(),1);
            } else {
                holder.put(currentDate.getDayOfWeek().getValue(),holder.get(currentDate.getDayOfWeek().getValue())+1);
            }
            count++;
        }

        ArrayList<String> al = new ArrayList<>();
        for(int i = 1; i < holder.size()+1;i++) {
            System.out.println(holder.get(i));
            if(holder.get(i) > 52) {
             switch(i) {
                 case 1:
                     al.add("Monday");
                     break;
                 case 2:
                     al.add("Tuesday");
                     break;
                 case 3:
                     al.add("Wednesday");
                     break;
                 case 4:
                     al.add("Thursday");
                     break;
                 case 5:
                     al.add("Friday");
                     break;
                 case 6:
                     al.add("Saturday");
                     break;
                 case 7:
                     al.add("Sunday");
                     break;
             }
            }
        }

        if(al.size() >0) {
            return Arrays.copyOf(al.toArray(), al.size(), String[].class);
        } else {
            return new String[] {};
        }
    }

    public static void main(String[] args) {
        System.out.println(mostFrequentDays(1770));
    }
}
