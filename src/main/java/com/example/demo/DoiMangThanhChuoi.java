package com.example.demo;

public class DoiMangThanhChuoi {

    public static void main(String args[]) {
        char[] ch = {'g', 'o', 'o', 'd', ' ', 'm', 'o', 'r', 'n', 'i', 'n', 'g'};
        // cách 1
        String str = new String(ch);
        System.out.println(str);
        // cách 2
        String str2 = String.valueOf(ch);
        System.out.println(str2);
    }
}
