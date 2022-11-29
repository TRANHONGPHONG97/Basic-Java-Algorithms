package com.example.demo;

import java.util.Scanner;

public class GiaiThua {
    public static void main(String[] args) {
        int number;
        System.out.println("Nhập vào số cần tính: ");
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();
        long fact = 1;
        int i = 1;
        while(i<=number)
        {
            fact = fact * i;
            i++;
        }
        System.out.println("Giai thừa của "+ number +" là: "+ fact);
    }
}
