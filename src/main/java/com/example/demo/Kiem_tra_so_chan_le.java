package com.example.demo;

import java.util.Scanner;

public class Kiem_tra_so_chan_le {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.printf("nhập vào số cần kiểm tra n: ");
        n = scanner.nextInt();

        if (n % 2 == 0) {
            System.out.println(n + " là số chẵn!");
        } else {
            System.out.println(n + " là số lẻ");
        }
    }
}

