package com.johngmarshall;

public class PesistentBugger {
    public static int persistence(long n) {
        int length =String.valueOf(n).length();
        if(length > 1) {

            int count = 0;
            while (length > 1) {
                int mulitply = 1;
                for (int i = 0; i < length; i++) {
                    String num = String.valueOf(String.valueOf(n).charAt(i));
                    mulitply *= Integer.parseInt(num);

                }
                n=mulitply;
                length = String.valueOf(mulitply).length();
                count++;
            }
            return count;
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(persistence(999));
    }
}
