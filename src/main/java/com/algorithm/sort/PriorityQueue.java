package com.algorithm.sort;

public class PriorityQueue {
    private int[] nums;
    private int size;

    public PriorityQueue(int initialCapacity) {
        nums = new int[initialCapacity];
        size = 0;
    }

    public void add(int num) {
        if (size == 0) {
            nums[0] = num;
            size++;
        } else {
            if (nums.length == size) {
                int[] newArray = new int[size << 1];
                System.arraycopy(nums, 0, newArray, 0, nums.length);
                nums = newArray;
            }
            nums[size] = num;
            topShift(size);
            size++;
        }

    }

    public int remove() {
        int max = nums[0];
        size--;
        if (size > 0) {
            int temp = nums[0];
            nums[0] = nums[size];
            nums[size] = temp;
            downShift(0);
        }
        return max;
    }

    public int peek() {
        return nums[0];
    }


    private void downShift(int current) {
        int left = (current << 1) + 1;
        int right = left + 1;
        while (left < size) {
            int max = current;
            if (nums[left] > nums[current]) {
                max = left;
            }
            if (right < size && nums[right] > nums[max]) {
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

    private void topShift(int current) {
        int parent = (current - 1) >> 1;
        while (parent >= 0) {
            if (nums[current] < nums[parent]) {
                break;
            }
            int temp = nums[current];
            nums[current] = nums[parent];
            nums[parent] = temp;
            current = parent;
            parent = (current - 1) >> 1;
        }

    }

    public int size(){
        return size;
    }

}
