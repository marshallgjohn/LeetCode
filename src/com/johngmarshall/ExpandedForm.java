package com.johngmarshall;

public class ExpandedForm {
    public static String expandedForm(int num)
    {
        if(Math.floor(num/Math.pow(10.0,String.valueOf(num).length()-1))*Math.pow(10.0,String.valueOf(num).length()-1) == num) {
            return String.valueOf(num);
        }
        System.out.println(num);
        double curr = 0;
        StringBuilder sb = new StringBuilder();
        while(String.valueOf(num).length() > 1) {
            double adjust = (Math.pow(10.0,String.valueOf(num).length()-1));
            double number = num/adjust;
            curr = Math.floor(number)*adjust;
            sb.append((int)curr).append(" + ");
            num = (int)(num-curr);
        }
        return sb.append(num).toString();
    }

    public static void main(String[] args) {
        System.out.println(expandedForm(9000000));
    }
}
