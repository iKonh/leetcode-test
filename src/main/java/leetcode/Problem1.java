package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 *
 * You may assume that each input would have exactly one solution.
 *
 * Example:
 * Given nums = [2, 7, 11, 15], target = 9,
 *
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 */
public class Problem1 {

    public static int[] twoSum(int[] nums, int target) {
        int[] nums_bak = Arrays.copyOf(nums, nums.length);
        Arrays.sort(nums);
        // 第一个数从数组首位开始，第二个数从末尾开始
        int[] result = {0, nums.length - 1};

        for (int i = result[0]; i < nums.length - 1; i++) {
            // 两数相加大于期待结果时，第一个数保留当前位置，第二个数位置往前调整一位
            if (nums[i] + nums[result[1]] > target) {
                for (int j = result[1]; j > 0; j--) {
                    // 两数相加小于期待结果时，第二个数保留当前位置
                    if (nums[i] + nums[j] <= target) {
                        result[1] = j;
                        break;
                    }
                }
            }
            // 等于期待结果时，循环结束
            if (nums[i] + nums[result[1]] == target) {
                result[0] = i;
                break;
            }
        }
        // 在原始数组中找出两数的位置
        int a = 0;
        int b = 0;
        for (int index = 0; index < nums_bak.length; index++) {
            if (nums[result[0]] == nums_bak[index] && a == 0) {
                a = index;
            } else if (nums[result[1]] == nums_bak[index]) {
                b = index;
            }
        }
        result = new int[]{a, b};
        return result;
    }

    public static int[] twoSum_map(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int index = 0; index < nums.length; index++) {
            int num1 = nums[index];
            int num2 = target - num1;
            if (map.get(num2) != null) {
                return new int[]{index, map.get(num2)};
            } else {
                map.put(num1, index);
            }
        }
        return new int[]{-1, -1};
    }
}
