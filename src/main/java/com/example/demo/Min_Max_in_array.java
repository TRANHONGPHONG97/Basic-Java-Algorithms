package com.example.demo;

import java.util.Scanner;

public class Min_Max_in_array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tổng số phần tử của mảng arr: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Nhập phần tử thứ " + (i+1) + ": ");
            arr[i] = scanner.nextInt();
        }
        int min = arr[0];
        int max = arr[0];
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] < min) {
                min = arr[j];
            }
            if (arr[j] > max) {
                max = arr[j];
            }
        }
        System.out.println("GTNN là: " + min);
        System.out.println("GTLN là: " + max);
    }
}
