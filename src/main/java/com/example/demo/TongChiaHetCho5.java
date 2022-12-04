package com.example.demo;

import java.util.Scanner;

public class TongChiaHetCho5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập n:");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Nhập phần tử thứ " + (i + 1) + " :");
            arr[i] = scanner.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 5 == 0) {
                sum += arr[i];
            }
        }
        System.out.println("Tổng các phần tử chia hết cho 5 có trong mảng là: " + sum);
    }
}
