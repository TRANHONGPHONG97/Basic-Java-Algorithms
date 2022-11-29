package com.example.demo;

import java.util.*;
import java.util.Scanner;

public class SoNgauNhien {

    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bạn muốn Random bao nhiêu số: ");
        n = scanner.nextInt();
        int counter;
        Random rnum = new Random();
        System.out.println("Các số Random là: ");
        for (counter = 1; counter <= n; counter++) {
            System.out.println(rnum.nextInt(200));
        }
    }
}
