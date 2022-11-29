package com.example.demo;

import java.util.Scanner;

public class Hoandoi2sokhongdungbientemp {

    public static void main(String[] args) {
        //sử dụng class Scanner để lấy dữ liệu từ bàn phím
        Scanner sc = new Scanner(System.in);
        //khai báo hai biến float a, b
        float a, b;
        // yêu cầu người dùng nhập vào hai số a và b
        System.out.println("\n\nNhập vào số a: ");
        a = sc.nextFloat();
        System.out.println("Nhập vào số b: ");
        b = sc.nextFloat();
        //sử dụng thuật toán hoán đổi với phép tính cộng trừ
        a = a - b;
        b = a + b;
        a = b - a;
        //sau khi hoán đổi thì hiển thị kết quả ra màn hình
        System.out.println("Sau khi hoán đổi\na = " + a + "\nb = " + b);
    }
}
