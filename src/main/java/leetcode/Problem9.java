package leetcode;

/**
 * Determine whether an integer is a palindrome. Do this without extra space.
 */
public class Problem9 {
    public static boolean isPalindrome(int x) {
        int bak = x;
        int revert = 0;
        while (x > 0) {
            int tmp = x / 10;
            revert = revert * 10 + (x - tmp * 10);
            x = tmp;
        }
        return bak == revert;
    }
}
