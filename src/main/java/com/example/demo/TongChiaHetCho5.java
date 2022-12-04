package com.example.demo;

import java.util.Scanner;

public class TongChiaHetCho5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập n: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Nhập phần tử thứ " + (i + 1) + " :");
            arr[i] = scanner.nextInt();
        }
        System.out.println("Các số chia hết cho 5 là: ");
        int sum = 0;
        for (int j = 0; j < arr.length; j++) {
            // nếu i không chia hết cho 5 thì quay lại vòng lặp for
            if (arr[j] % 5 != 0) {
                continue;
            }
            sum += arr[j];
            System.out.println(arr[j]);
        }
        System.out.println("Tổng các số chia hết cho 5 là: " + sum);
    }
}
