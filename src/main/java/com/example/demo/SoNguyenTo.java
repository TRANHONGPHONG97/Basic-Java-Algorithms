package com.example.demo;

import java.util.Scanner;

public class SoNguyenTo {
    public static void main(String args[]) {
        int temp;
        boolean isPrime = true;
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhập vào số cần kiểm tra: ");
        int num = scan.nextInt();
        for (int i = 2; i <= num / 2; i++) {
            temp = num % i;
            if (temp == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime)
            System.out.println(num + " là số nguyên tố!");
        else
            System.out.println(num + " không phải là số nguyên tố!");
    }
}
