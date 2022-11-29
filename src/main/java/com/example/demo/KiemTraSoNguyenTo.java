package com.example.demo;

import java.util.Scanner;

public class KiemTraSoNguyenTo {
    //    public static void main(String args[]) {
//        int n;
//        int status = 1;
//        int num = 3;
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhập vào n số nguyên tố đầu tiên: ");
//        n = scanner.nextInt();
//        if (n >= 1) {
//            System.out.println(n + " Số nguyên tố đầu tiên là: ");
//            System.out.println(2);
//        }
//        for (int i = 2; i <= n; ) {
//            for (int j = 2; j <= Math.sqrt(num); j++) {
//                if (num % j == 0) {
//                    status = 0;
//                    break;
//                }
//            }
//            if (status != 0) {
//                System.out.println(num);
//                i++;
//            }
//            status = 1;
//            num++;
//        }
//    }
//    public static void main(String[] args) {
//        int i = 0;
//        int num = 0;
//        String primeNumbers = "";
//        for (i = 1; i <= 100; i++) {
//            int counter = 0;
//            for (num = i; num >= 1; num--) {
//                if (i % num == 0) {
//                    counter = counter + 1;
//                }
//            }
//            if (counter == 2) {
//                primeNumbers = primeNumbers + i + " ";
//            }
//        }
//        System.out.println("Các số nguyên tố từ 1 đến 100 là:");
//        System.out.println(primeNumbers);
//    }
    public static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int i =0;
        int num =0;
        String  primeNumbers = "";
        System.out.println("Nhập vào số n:");
        int n = scanner.nextInt();
        scanner.close();
        for (i = 1; i <= n; i++)
        {
            int counter=0;
            for(num =i; num>=1; num--)
            {
                if(i%num==0)
                {
                    counter = counter + 1;
                }
            }
            if (counter ==2)
            {
                primeNumbers = primeNumbers + i + " ";
            }
        }
        System.out.println("Các số nguyên tố từ 1 đến "+ n +" là:");
        System.out.println(primeNumbers);
    }
}
