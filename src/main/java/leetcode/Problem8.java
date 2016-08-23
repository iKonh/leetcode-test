package leetcode;

/**
 * Implement atoi to convert a string to an integer.
 */
public class Problem8 {
    public static int myAtoi(String str) {
        int index = 0;
        // 去掉开头结尾的空格
        str = str.trim();
        // 空串返回0
        if ("".equals(str)) {
            return 0;
        }
        // 判断字符串符号
        int sign = 1;
        if (str.charAt(index) == '-') {
            sign = -1;
            index ++;
        } else if (str.charAt(index) == '+') {
            index ++;
        }
        int result = 0;
        while (index < str.length()) {
            char c = str.charAt(index);
            // 包含非法字符，转换终止
            if (c < 48 || c > 57) {
                break;
            }
            int tmp = result;
            result = result * 10 + sign * (c - 48);
            if (result / 10 != tmp) {
                return sign > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            index ++;
        }
        return result;
    }
}
