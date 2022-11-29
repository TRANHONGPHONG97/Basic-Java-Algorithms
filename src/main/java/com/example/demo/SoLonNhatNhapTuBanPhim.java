package com.example.demo;

import java.util.Scanner;

public class SoLonNhatNhapTuBanPhim {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Nhập số lượng phần tử cho mảng: ");
        n = sc.nextInt();
        int[] numberArr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + i + ": ");
            numberArr[i] = sc.nextInt();
        }
        int max = numberArr[0];
        for (int num : numberArr) {
            if (max < num)
                max = num;
        }
        System.out.println("Số lớn nhất trong mảng là: " + max);
    }
}
