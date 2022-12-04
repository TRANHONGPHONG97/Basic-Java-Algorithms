package com.example.demo;

import java.util.Scanner;

public class SoDoiXung {
    public static void main(String[] args) {
        //sử dụng class Scanner để lấy dữ liệu từ bàn phím
        Scanner sc = new Scanner(System.in);
        //khai báo biến num1 là số cần kiểm tra đối xứng
        //reversed là số sau khi đảo ngược
        //original là biến để lưu lại số cần kiểm tra
        int num1, reversed = 0, original;
        System.out.println("Nhập vào số cần kiểm tra: ");
        num1 = sc.nextInt();
        //gán giá trị vừa nhập vào cho biến original để so sánh với reversed
        original = num1;
        //sử dụng vòng lặp for để đảo ngược num1
        for (; num1 != 0; num1 /= 10) {
            int digit = num1 % 10;
            reversed = reversed * 10 + digit;
        }
        //so sánh reversed (số đảo ngược) với original (số ban đầu)
        //nếu bằng thì là số đối xứng
        if (reversed == original) {
            System.out.println(original + " là số đối xứng!");
        }
        //không bằng thì không phải số đối xứng
        else {
            System.out.println(original + " không phải là số đối xứng!");
        }
    }

}
