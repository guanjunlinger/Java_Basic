package com.algorithm.sort;

public class HeapSort {

    public static void sort(int[] nums) {
        build(nums);
        int n = nums.length;
        for (int i = n - 1; i > 0; i--) {
            int temp = nums[0];
            nums[0] = nums[i];
            nums[i] = temp;
            heapify(nums, 0, i);


        }

    }

    private static void build(int[] nums) {
        int len = nums.length;
        if (len > 1) {
            for (int i = (len - 2 >> 1); i >= 0; i--) {
                heapify(nums, i, len);
            }
        }
    }

    private static void heapify(int[] nums, int current, int length) {
        int len = length;
        int left = (current << 1) + 1;
        int right = left + 1;
        while (left < len) {
            int max = current;
            if (nums[left] > nums[current]) {
                max = left;
            }
            if (right < len && nums[right] > nums[max]) {
                max = right;
            }
            if (max == current) {
                break;
            }

            int temp = nums[max];
            nums[max] = nums[current];
            nums[current] = temp;
            current = max;
            left = (current << 1) + 1;
            right = left + 1;
        }

    }
}


