package com.example.demo;

import java.util.Scanner;

public class KiemTraNguyenAm {

    public static void main(String[] arg) {
        boolean isVowel = false;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào kí tự cần kiểm tra: ");
        char ch = scanner.next().charAt(0);
        scanner.close();
        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                isVowel = true;
        }
        if (isVowel) {
            System.out.println(ch + " Là nguyên âm");
        } else {
            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
                System.out.println(ch + " Là phụ âm");
            else
                System.out.println("Không nằm trong bảng chữ cái!");
        }
    }

    public class DemNguyenAm {
        public void main(String[] args) {
            String str = "HELLO WORLD";
            int vcount = 0, ccount = 0;
            str = str.toLowerCase();
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vcount++;
                } else if ((ch >= 'a' && ch <= 'z')) {
                    ccount++;
                }
            }
            System.out.println("Số nguyên âm: " + vcount);
            System.out.println("Số phụ âm: " + ccount);
        }
    }
}
