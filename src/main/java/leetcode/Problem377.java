package leetcode;

import java.util.Arrays;

/**
 * Given an integer array with all positive numbers and no duplicates, find the number of possible combinations that add up to a positive integer target.
 * Example:
 *
 * nums = [1, 2, 3]
 * target = 4
 *
 * The possible combination ways are:
 * (1, 1, 1, 1)
 * (1, 1, 2)
 * (1, 2, 1)
 * (1, 3)
 * (2, 1, 1)
 * (2, 2)
 * (3, 1)
 *
 * Note that different sequences are counted as different combinations.
 *
 * Therefore the output is 7.
 */
public class Problem377 {
    public static int combinationSum4(int[] nums, int target) {
        Arrays.sort(nums);
        int[] result = new int[target + 1];
        for (int i = 1; i < result.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] < i) {
                    // 取得结果为(i-nums[j])的组合数
                    result[i] += result[i-nums[j]];
                } else {
                    // 如果i与nums[j]的值相等，则组合数+1，否则不加
                    result[i] += i/nums[j];
                    // 不考虑之后大于i的数(仅限于排序的场合)
                    break;
                }
            }
        }
        return result[target];
    }
}
