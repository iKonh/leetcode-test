package leetcode;

import java.util.Arrays;

/**
 * Given an array S of n integers, find three integers in S such that the sum is closest to a given number, target. Return the sum of the three integers. You may assume that each input would have exactly one solution.
 *
 * For example, given array S = {-1 2 1 -4}, and target = 1.
 *
 * The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
 */
public class Problem16 {

    public static int threeSumClosest(int[] nums, int target) {
        // 最大负差值
        int min = 0;
        // 最小正差值
        int max = 0;
        Arrays.sort(nums);
        for (int index = 1; index < nums.length - 1; index++) {
            int second = nums[index];
            int firstIndex = 0;
            int thdIndex = nums.length - 1;
            int expect = target - second;
            while (firstIndex < index && thdIndex > index) {
                int tmp = expect - nums[firstIndex] - nums[thdIndex];
                if (tmp < 0) {
                    thdIndex --;
                    min = (min != 0 && min > tmp) ? min : tmp;
                } else if (tmp > 0) {
                    firstIndex ++;
                    max = (max != 0 && max < tmp) ? max : tmp;
                } else {
                    return target;
                }
            }
        }
        if (max == 0) {
            return target - min;
        }
        if (min == 0) {
            return target - max;
        }
        int closest = max < -min ? max : min;
        return target - closest;
    }
}
