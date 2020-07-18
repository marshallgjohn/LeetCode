package com.johngmarshall;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class encryptThis {
    public static String encryptThis(String text) {
        if(text.length() > 0) {
            StringBuilder string = new StringBuilder();
            String[] arr = text.split(" ");
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].length() == 1) {
                    string.append(String.format("%d ", (int) arr[i].charAt(0)));
                } else if (arr[i].length() == 2) {
                    string.append(String.format("%d%s ", (int) arr[i].charAt(0), arr[i].substring(1)));
                } else {
                    string.append(String.format("%d%s%s%s ", (int) arr[i].charAt(0), arr[i].substring(arr[i].length() - 1), arr[i].substring(2, arr[i].length() - 1), arr[i].substring(1, 2)));
                }
            }
            return string.replace(string.length() - 1, string.length(), "").toString();
        }
        return "";
    }

    public static void main (String[] args) {
        System.out.println(encryptThis("A wise old owl lived in an oak"));
    }
}
