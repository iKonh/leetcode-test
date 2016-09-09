package leetcode;

import java.util.Arrays;

/**
 * Given a non-negative number represented as an array of digits, plus one to the number.
 *
 * The digits are stored such that the most significant digit is at the head of the list.
 */
public class Problem66 {
    public static int[] plusOne(int[] digits) {
        for (int index = digits.length - 1; index >=0; index--) {
            if (digits[index] < 9) {
                digits[index]++;
                return digits;
            }
            digits[index] = 0;
        }
        int[] result = new int[digits.length + 1];
        System.arraycopy(digits, 0, result, 1, digits.length);
        result[0] = 1;
        return result;
    }
}
