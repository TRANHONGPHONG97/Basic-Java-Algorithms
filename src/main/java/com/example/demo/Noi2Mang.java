package com.example.demo;

import java.util.Arrays;

public class Noi2Mang {
    public static void main(String[] args) {
        //khai báo và khởi tạo giá trị cho các phần tử của hai mảng array1 và array2
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};
        //biến length sẽ bằng độ dài của hai mảng cộng lại
        int length = array1.length + array2.length;
        //Bây giờ khai báo thêm một mảng mới result để lưu trữ hai mảng cần nối, với độ dài bằng length
        int[] result = new int[length];
        int pos = 0;
        //sử dụng vòng lặp for để lưu các phần tử trong mảng array1 vào mảng result
        for (int element : array1) {
            result[pos] = element;
            pos++;
        }
        //tương tự như vậy cho mảng hai
        for (int element : array2) {
            result[pos] = element;
            pos++;
        }
        //sau khi nối xong ta chỉ cần hiển thị mảng result ra màn hình
        System.out.println(Arrays.toString(result));
    }
}
