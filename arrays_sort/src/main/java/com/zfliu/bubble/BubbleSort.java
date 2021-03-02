package com.zfliu.bubble;

public class BubbleSort {
    public BubbleSort(int[] nums) {
        int length = nums.length;
        for (int i = 0; i < length - 1; i++) {
            boolean flag = true;
            for (int j = 0; j < length - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                    flag = false;
                }
            }
            if (flag) {
                break;
            }
        }

    }

    public static void main(String[] args) {
        int[] nums = new int[]{3, 2, 4, 1, 5, 67, 2};
        new BubbleSort(nums);
        for (int num : nums) {
            System.out.print(num + "--");
        }
    }
}
