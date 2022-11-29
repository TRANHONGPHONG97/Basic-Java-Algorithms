package com.example.demo;

import java.util.Scanner;

public class BoiChungNhoNhat {

    public static void main(String[] args) {
        //sử dụng class Scanner để lấy dữ liệu từ bàn phím
        Scanner sc = new Scanner(System.in);
        //khai báo n1, n2 là hai số cần tính bội chung nhỏ nhất
        //lcm là bội chung nhỏ nhất của a và b
        int n1, n2, lcm;
        System.out.println("\n\nNhập vào số thứ nhất: ");
        n1 = sc.nextInt();
        System.out.println("Nhập vào số thứ hai: ");
        n2 = sc.nextInt();
        //sử dụng toán tử ba ngôi để gán giá trị lớn nhất giữa a và b cho lcm
        //->> vì bcnn của a và b luôn luôn lớn hơn a và b
        lcm = (n1 > n2) ? n1 : n2;
        //sử dụng vòng lặp while với điều kiện true để lặp đến khi nào gặp lệnh break;
        while (true) {
            //nếu lcm chia hết cho n1 và n2, tức là lcm chính là bcnn của a và b
            if (lcm % n1 == 0 && lcm % n2 == 0) {
                System.out.printf("Bội chung nhỏ nhất của %d và %d là %d.", n1, n2, lcm);
                break;
            }
            //lcm bắt đầu từ giá trị lớn nhất giữa a và b, nếu không phải là bcnn thì tăng lên 1 rồi tiếp tục kiểm tra, cứ như vậy cho đến khi tìm được
            ++lcm;
        }
    }
}
