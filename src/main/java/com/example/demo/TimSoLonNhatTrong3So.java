package com.example.demo;

import java.util.Scanner;

public class TimSoLonNhatTrong3So {
    public static void main(String[] args) {
        int a, b, c;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số thứ nhất: ");
        a = scanner.nextInt();
        System.out.println("Nhập vào số thứ hai: ");
        b = scanner.nextInt();
        System.out.println("Nhập vào số thứ ba: ");
        c = scanner.nextInt();
        if (a >= b && a >= c)
            System.out.println(a + " là số lớn nhất!!");
        else if (b >= a && b >= c)
            System.out.println(b + " là số lớn nhất!!");
        else
            System.out.println(c + " là số lớn nhất!!");
    }
}
