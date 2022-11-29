package com.example.demo;

import java.util.HashMap;
import java.util.Map;

public class CheckTong2So {
// Dùng 1 vòng lặp
//    public static void main(String[] args) {
//        int[] arr = {1, 4, 45, 6, 10, -8};
//        int sum = 15;
//        int size_arr = arr.length;
//        System.out.println(checkPairSumWayTwo(arr, size_arr, sum));
//    }

//    static boolean checkPairSumWayTwo(int[] arr, int size_arr, int sum) {
//        Arrays.sort(arr);
//        int l = 0, r = size_arr - 1;
//        while (l < r) {
//            if (arr[l] + arr[r] == sum)
//                return true;
//            else if (arr[l] + arr[r] > sum)
//                r--;
//            else
//                l++;
//        }
//        return false;
//    }

//    public static void main(String[] args) {
////    Sử dụng 2 vòng lặp
//        int[] arr = {1, 5, 2, 4, 3};
//        int sum = 5;
//        int size_arr = arr.length;
//        System.out.println(checkPairSum(arr, size_arr, sum));
//    }
//    static boolean checkPairSum(int[] arr, int size_arr, int sum) {
//        for (int i = 0; i < size_arr - 1; i++)
//            for (int j = i + 1; j < size_arr; j++)
//                if (arr[i] + arr[j] == sum)
//                    return true;
//        return false;
//    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 6, 2, 3, 0};
        int sum = 5;
        Map<Integer, Integer> map = new HashMap<>();
        for (int value : arr) {
            if (map.containsKey(value)) {
                map.put(value, map.get(value) + 1);
            } else {
                map.put(value, 1);
            }
        }
        for (int i=0; i< arr.length; i++)
        {
            if(map.get(sum-arr[i]) != null && map.get(sum - arr[i]) >= 1 && map.get(arr[i]) >= 1) {
                System.out.println("Cặp số đó là: " + arr[i] + " - " + (sum - arr[i]));
                map.put(sum - arr[i], map.get(sum - arr[i]) - 1);
                map.put(arr[i], map.get(arr[i]) - 1);
            }
        }
    }
}
