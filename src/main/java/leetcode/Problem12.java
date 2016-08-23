package leetcode;

/**
 * Given an integer, convert it to a roman numeral.
 *
 * Input is guaranteed to be within the range from 1 to 3999.
 *
 * 罗马数字:
 * 1~9: {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
 *
 * 10~90: {"X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
 *
 * 100~900: {"C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
 *
 * 1000~3000: {"M", "MM", "MMM"}.
 */
public class Problem12 {

    private static String I[] = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
    private static String X[] = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
    private static String C[] = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
    private static String M[] = {"", "M", "MM", "MMM"};

    public static String intToRoman(int num) {
        return M[num / 1000] + C[(num%1000) / 100] + X[(num%100)/10] + I[num%10];
    }
}
