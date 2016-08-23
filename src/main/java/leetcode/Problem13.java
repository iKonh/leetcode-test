package leetcode;

/**
 * Given a roman numeral, convert it to an integer.
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
public class Problem13 {

    public static int romanToInt(String s) {
        int sumI = 0;
        int sumX = 0;
        int sumC = 0;
        int sumM = 0;
        for (int index = 0; index < s.length(); index++) {
            switch (s.charAt(index)) {
                case 'M':
                    sumM += 1000;
                    sumC = -sumC;
                    break;
                case 'C':
                    sumC += 100;
                    sumX = -sumX;
                    break;
                case 'D':
                    sumC = 500 - sumC;
                    break;
                case 'X':
                    sumX += 10;
                    sumI = -sumI;
                    break;
                case 'L':
                    sumX = 50 - sumX;
                    break;
                case 'I':
                    sumI += 1;
                    break;
                case 'V':
                    sumI = 5 - sumI;
                    break;
                default:
                    break;
            }

        }
        return sumI + sumX + sumC + sumM;
    }
}
