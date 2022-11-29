package com.example.demo;

public class TinhTongCacSoTrongMang {

    public static void main(String args[]) {
        int[] array = {10, 20, 30, 40, 50, 10};
        int sum = 0;
        //Advanced for loop
        for (int i = 0; i < array.length ; i++) {
            sum = sum + array[i];
        }
//        for (int num : array) {
//            sum = sum + num;
//        }
        System.out.println("Kết quả là: " + sum);
    }
}
