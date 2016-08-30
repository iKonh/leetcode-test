package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a digit string, return all possible letter combinations that the number could represent.
 */
public class Problem17 {

    private static char[] TWO = {'a', 'b', 'c'};

    private static char[] THREE = {'d', 'e', 'f'};

    private static char[] FOUR = {'g', 'h', 'i'};

    private static char[] FIVE = {'j', 'k', 'l'};

    private static char[] SIX = {'m', 'n', 'o'};

    private static char[] SEVEN = {'p', 'q', 'r', 's'};

    private static char[] EIGHT = {'t', 'u', 'v'};

    private static char[] NINE = {'w', 'x', 'y', 'z'};

    private static char[] DEFAULT = {};

    public static List<String> letterCombinations(String digits) {
        List<String> resultList = new ArrayList<>();
        if (digits != null && digits.length() > 0) {
            String result = "";
            letterCombinations(digits, 0, result, resultList);
        }
        return resultList;
    }

    private static void letterCombinations(String digits, int index, String result, List<String> resultList) {
        char digit = digits.charAt(index);
        char[] array = getCharArray(digit);
        if (index == digits.length() - 1) {
            for (char c : array) {
                resultList.add(result + c);
            }
        } else {
            index ++;
            for (char c : array) {
                letterCombinations(digits, index, result + c, resultList);
            }
        }
    }

    private static char[] getCharArray(char c) {
        switch (c) {
            case '2':
                return TWO;
            case '3':
                return THREE;
            case '4':
                return FOUR;
            case '5':
                return FIVE;
            case '6':
                return SIX;
            case '7':
                return SEVEN;
            case '8':
                return EIGHT;
            case '9':
                return NINE;
            default:
                return DEFAULT;
        }
    }
}
