package com.algorithm.sort;

public class CountingSort {
    private static final int max = 100;

    public static int[] sort(int[] nums) {
        int len = nums.length;
        int[] count = new int[max];
        int[] result = new int[len];
        for (int i = 0; i < len; i++) {
            count[nums[i]]++;
        }
        for (int i = 1; i <max; i++) {
            count[i] = count[i]+count[i - 1];
        }
        for (int i = len-1; i >=0; i--) {
            result[--count[nums[i]]] = nums[i];
        }
        return result;

    }

}
