package com.example.demo;

public class SoHoanHao {
    public static boolean checkSoHH(int a) {
        int sum = 0;
        for (int i = 1; i < a; i++) {
            if (a % i == 0)
                //tổng các ước số của a
                sum += i;
        }
        if (sum == a) {
            System.out.println(a + " là số HH");
        } else {
            System.out.println(a + " không phải là số HH");
        }
        return false;
    }

    public static void main(String[] args) {
        checkSoHH(6);
    }
}
