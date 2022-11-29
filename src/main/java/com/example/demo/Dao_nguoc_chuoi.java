package com.example.demo;

public class Dao_nguoc_chuoi {
    public static void main(String[] args) {
        String input = "Hello";
        char[] temp_array = input.toCharArray();
        int left, right = 0;
        right = temp_array.length - 1;
        for (left = 0; left < right; left++, right--) {
            // Swap values of left and right
            char temp = temp_array[left];
            temp_array[left] = temp_array[right];
            temp_array[right] = temp;
        }
        for (char c : temp_array)
            System.out.print(c);
    }
}
