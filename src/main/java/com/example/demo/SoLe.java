package com.example.demo;

import java.util.Scanner;

public class SoLe {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.println("Nhập vào số n: ");
        n = scanner.nextInt();
        System.out.println("Các số lẻ từ 1 đến " + n + " là: ");
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                System.out.print(i + " ");
            }
        }
    }
}
