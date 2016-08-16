package leetcode;

/**
 * Reverse digits of an integer.
 * Example1: x = 123, return 321
 * Example2: x = -123, return -321
 */
public class Problem7 {

    public static int reverse(int x) {
        int result = 0;
        while (x != 0) {
            int tmp = x;
            x = x/10;
            int result_tmp = result * 10 + (tmp - x * 10);
            // 结果超出int极值时，返回0
            if (result_tmp / 10 != result) {
                return 0;
            }
            result = result_tmp;
        }
        return result;
    }
}
