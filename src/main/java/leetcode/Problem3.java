package leetcode;

/**
 * Given a string, find the length of the longest substring without repeating characters.
 *
 * Examples:
 *
 * Given "abcabcbb", the answer is "abc", which the length is 3.
 *
 * Given "bbbbb", the answer is "b", with the length of 1.
 *
 * Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
 */
public class Problem3 {

    public static int lengthOfLongestSubstring(String s) {
        int[] ints = new int[128];
        // 最大字符串长度
        int maxLength = 0;
        // 当前字符串长度
        int tmpLength = 0;
        // 记录当前字符串起始位置
        int startIndex = 0;
        for (int index = 0; index < s.length(); index++) {
            char c = s.charAt(index);
            // 当前字符串中包含该字符
            if (ints[c] > startIndex) {
                maxLength = maxLength > tmpLength ? maxLength : tmpLength;
                // 当前字符串从重复字符后开始计算
                tmpLength = tmpLength - (ints[c] - startIndex);
                // 前字符串起始位置改为重复字符后一位
                startIndex = ints[c];
            }
            ints[c] = index + 1;
            tmpLength ++;
        }
        return maxLength > tmpLength ? maxLength : tmpLength;
    }
}
