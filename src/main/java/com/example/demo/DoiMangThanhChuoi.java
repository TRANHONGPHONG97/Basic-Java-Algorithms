package com.example.demo;

public class DoiMangThanhChuoi {

    public static void main(String args[]) {
//        char[] ch = {'g', 'o', 'o', 'd', ' ', 'm', 'o', 'r', 'n', 'i', 'n', 'g'};
//        char[] ch1 = {'0', '9', '7', '6', '9', '3', '4', '4', '6', '2'};
//        // cách 1
////        String str = new String(ch);
//        String str1 = new String(ch1);
////        System.out.println(str);
//        System.out.println(str1);
//        // cách 2
////        String str2 = String.valueOf(ch);
//        String str3 = String.valueOf(ch1);
////        System.out.println(str2);
//        System.out.println(str3);

//  CODE: Cho 1 số điện thoại, Cho 1 mảng, Đổi mảng đó thành số điện thoại.
        int[] arrays = {0, 9, 7, 6, 9, 3, 4, 4, 6, 2};
        String str = "";
        for(int i = 0; i < arrays.length; i++) {
            str = str + arrays[i];
        }
        System.out.println(str);
    }
}
