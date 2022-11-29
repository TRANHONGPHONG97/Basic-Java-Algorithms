package com.example.demo;

import java.util.Scanner;

public class NamNhuan {

    public static void main(String[] args) {
        int year;
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhập vào năm bạn cần kiểm tra: ");
        year = scan.nextInt();
        scan.close();
        boolean isLeap = false;
        if (year % 4 == 0)//chia hết cho 4 là năm nhuận
        {
            if (year % 100 == 0)
            //nếu vừa chia hết cho 4 mà vừa chia hết cho 100 thì không phải năm nhuận
            {
                if (year % 400 == 0)//chia hết cho 400 là năm nhuận
                    isLeap = true;
                else
                    isLeap = false;//không chia hết cho 400 thì không phải năm nhuận
            } else//chia hết cho 4 nhưng không chia hết cho 100 là năm nhuận
                isLeap = true;
        } else {
            isLeap = false;
        }
        if (isLeap == true)
            System.out.println(year + " là năm nhuận.");
        else
            System.out.println(year + " không phải là năm nhuận.");
    }
}
