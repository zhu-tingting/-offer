package Algorithms.Array;

import java.util.Arrays;

/**
 * Created by zhutingting05 on 2019-07-25.
 */
public class MajorityElement {
    public int majorityElement(int[] nums) {
        int len = nums.length;
        Arrays.sort(nums);
        return nums[len / 2];
    }

    /**
     * Boyer-Moore 投票算法
     *
     * @param nums
     * @return
     */
    public int majorityElement2(int[] nums) {

        Integer major = null;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (count == 0) {
                major = nums[i];
            }
            count += nums[i] == major ? +1 : -1;
        }

        return major;

    }

    public static void main(String[] args) {
        int[] nums = new int[]{3, 2, 3};
        MajorityElement majorityElement = new MajorityElement();
        System.out.println(majorityElement.majorityElement(nums));
        System.out.println(majorityElement.majorityElement2(nums));
    }

}
