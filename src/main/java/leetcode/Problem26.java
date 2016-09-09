package leetcode;

/**
 * Given a sorted array, remove the duplicates in place such that each element appear only once and return the new length.
 *
 * Do not allocate extra space for another array, you must do this in place with constant memory.
 *
 * For example,
 * Given input array nums = [1,1,2],
 *
 * Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively. It doesn't matter what you leave beyond the new length.
 */
public class Problem26 {
    public static int removeDuplicates(int[] nums) {

        int length = 0;
        int tmp = 0;
        for (int index = 0; index < nums.length; index++) {
            if (index > 0 && nums[index] == tmp) {
                continue;
            }
            tmp = nums[index];
            nums[length] = tmp;
            length++;
        }
        return length;
    }
}
