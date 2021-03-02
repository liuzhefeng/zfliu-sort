package com.zfliu.insert;

/**
 * 将数组中的所有元素依次跟前面已经排好的元素相比较，如果选择的元素比已排序
 * 的元素小，则交换，直到全部元素都比较过。
 */
public class InsertSort {
    public InsertSort(int[] nums) {
        int length = nums.length;
        for (int i = 1; i < length; i++) {
            for (int j = i - 1; j >= 0; j--) {
                /**
                 * 选择的元素比已排序
                 * 的元素小
                 * */
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{3, 2, 4, 1, 5, 67, 2};
        new InsertSort(nums);
        for (int num : nums) {
            System.out.print(num + "--");
        }
    }
}
