package Algorithms.Array;

import java.util.Arrays;

/**
 * Created by zhutingting05 on 2019-07-26.
 */
public class FirstMissingPositive {
    public int firstMissingPositive(int[] nums) {

        int len = nums.length;
        for (int i = 0; i < len; i++) {
            while (nums[i] > 0 && nums[i] <= len && nums[i] != nums[nums[i] - 1]) {
                swap(nums, i, nums[i] - 1);
            }
        }

        for (int i = 0; i < len; i++) {
            if (i != nums[i] - 1) {
                return i + 1;
            }
        }

        return len+1;
    }

    public void swap(int[] nums, int index1, int index2) {
        if (index1 == index2) {
            return;
        }

        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;

        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1};
        FirstMissingPositive firstMissingPositive = new FirstMissingPositive();
        System.out.println(firstMissingPositive.firstMissingPositive(nums));

    }
}
