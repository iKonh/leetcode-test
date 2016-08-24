package leetcode;

/**
 * Write a function to find the longest common prefix string amongst an array of strings.
 *
 */
public class Problem14 {

    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        String commonPrefix = null;
        // 取最短字符串作为比较对象
        for (String str : strs) {
            commonPrefix = commonPrefix != null && commonPrefix.length() < str.length()?commonPrefix:str;
        }
        for (String str : strs) {
            while (!str.startsWith(commonPrefix)) {
                commonPrefix = commonPrefix.substring(0, commonPrefix.length() - 1);
            }
        }
        return commonPrefix;
    }
}
