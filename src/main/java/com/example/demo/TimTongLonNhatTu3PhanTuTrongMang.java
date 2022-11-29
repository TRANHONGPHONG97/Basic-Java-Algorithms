package com.example.demo;

public class TimTongLonNhatTu3PhanTuTrongMang {
    public static int maxSumTriplet(int[] arr, int n) {
        int sum = 0;
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (sum < arr[i] + arr[j] + arr[k])
                        sum = arr[i] + arr[j] + arr[k];
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 7, 2, 10, 5};
        System.out.println("Tổng lớn nhất từ 3 phần tử trong mảng là: " + maxSumTriplet(arr, arr.length));
    }
}
