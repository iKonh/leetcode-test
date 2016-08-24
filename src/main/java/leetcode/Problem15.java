package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given an array S of n integers, are there elements a, b, c in S such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.
 *
 * For example, given array S = [-1, 0, 1, 2, -1, -4],
 *
 * A solution set is:
 * [
 *  [-1, 0, 1],
 *  [-1, -1, 2]
 * ]
 */
public class Problem15 {

    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> resultList = new ArrayList<>();
        boolean addZero = false;
        if (nums.length > 2) {
            for (int index = 1; index < nums.length - 1; index++) {
                int firstIndex = index - 1;
                int lastIndex = index + 1;
                int num1 = nums[index];
                // 中间数小于0时，取相同数的最右侧
                if (num1 < 0 && num1 == nums[lastIndex] && lastIndex < nums.length - 1) {
                    continue;
                }
                // 中间数大于0时，取相同数的最左侧
                else if (num1 > 0 && num1 == nums[firstIndex] && firstIndex > 0) {
                    continue;
                }
                // 中间数等于0时，取最右侧的0
                else if (num1 == 0 && num1 == nums[lastIndex]) {
                    // 3个数都为0时，标记
                    if (num1 == nums[firstIndex]) {
                        addZero = true;
                    }
                    continue;
                }
                while (firstIndex >= 0 && lastIndex <= nums.length - 1) {
                    int num0 = nums[firstIndex];
                    int num2 = nums[lastIndex];
                    int sum = num0 + num2;
                    if (sum == -num1) {
                        List<Integer> result = new ArrayList<>();
                        result.add(num0);
                        result.add(num1);
                        result.add(num2);
                        resultList.add(result);
                    }
                    // 3个数相加大于0时，左侧数左移
                    if (sum >= -num1) {
                        while (firstIndex >= 0 && num0 == nums[firstIndex]) {
                            firstIndex--;
                        }
                    }
                    // 3个数相加小于0时，右侧数右移
                    if (sum <= -num1) {
                        while (lastIndex <= nums.length - 1 && num2 == nums[lastIndex]) {
                            lastIndex++;
                        }
                    }
                }
            }
        }
        // 3个0的情况
        if (addZero) {
            List<Integer> zeroList = new ArrayList<>();
            zeroList.add(0);
            zeroList.add(0);
            zeroList.add(0);
            resultList.add(zeroList);
        }
        return resultList;
    }
}
