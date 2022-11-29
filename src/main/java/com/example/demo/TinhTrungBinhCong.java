package com.example.demo;

public class TinhTrungBinhCong {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,9};
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total = total + arr[i];
        }
        int average = total / arr.length;
        System.out.println(average);
    }
}
