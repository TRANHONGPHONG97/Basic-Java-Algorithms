package com.example.demo;

public class CapSoDoiXung {

    public static void main(String[] args) {
        int [] arr = {1, 3, 5, 6, 0, 5, 5, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == arr[arr.length - i - 1] && i < (arr.length - 1) / 2) {
                System.out.println("Cặp số đx là: " + (arr[i] +"-"+ arr[i]));
            }
        }
    }
}
