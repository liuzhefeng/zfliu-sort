package com.zfliu.select;

/**
 * 简单选择排序的基本思想：比较+交换。
 * <p>
 * 从待排序序列中，找到关键字最小的元素；
 * 如果最小元素不是待排序序列的第一个元素，将其和第一个元素互换；
 * 从余下的 N - 1 个元素中，找出关键字最小的元素，重复(1)、(2)步，直到排序结束。
 * 因此我们可以发现，简单选择排序也是通过两层循环实现。
 * 第一层循环：依次遍历序列当中的每一个元素
 * 第二层循环：将遍历得到的当前元素依次与余下的元素进行比较，符合最小元素的条件，则交换。
 */
public class SelectSort {
    public SelectSort(int[] nums) {
        int length = nums.length;
        for (int i = 0; i < length - 1; i++) {
            for (int j = i + 1; j < length; j++) {
                if (nums[i] > nums[j]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{3, 2, 4, 1, 5, 67, 2};
        new SelectSort(nums);
        for (int num : nums) {
            System.out.print(num + "--");
        }
    }
}
