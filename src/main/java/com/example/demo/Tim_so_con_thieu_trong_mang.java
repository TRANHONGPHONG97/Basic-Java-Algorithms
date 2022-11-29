package com.example.demo;

public class Tim_so_con_thieu_trong_mang {
    public static void main(String[] args) {
        int[] S = {1,2,10,4,5,6,7,3,8};
        int a =0;
        int b =0;
        for (int i = 0; i < S.length ; i++) {
            a+=S[i];
        }
        for (int i = 1; i <=10 ; i++) {
            b+=i;
        }
        System.out.println((b-a));
    }
}
