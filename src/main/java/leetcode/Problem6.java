package leetcode;

/**
 * The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)
 *
 * P   A   H   N
 * A P L S I I G
 * Y   I   R
 *
 * And then read line by line: "PAHNAPLSIIGYIR"
 *
 * Write the code that will take a string and make this conversion given a number of rows:
 *
 * string convert(string text, int nRows);
 *
 * convert("PAYPALISHIRING", 3) should return "PAHNAPLSIIGYIR".
 */
public class Problem6 {

    public static String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }
        int length = numRows * 2 - 2;
        StringBuilder[] stringBuilderArray = new StringBuilder[numRows];
        for (int index = 0; index < numRows; index++) {
            stringBuilderArray[index] = new StringBuilder();
        }
        for (int index = 0; index < s.length(); index++) {
            char c = s.charAt(index);
            int local = index % length;
            // stringBuilderArray 0至(numRows-1)正序赋值
            if (local < stringBuilderArray.length - 1) {
                stringBuilderArray[local].append(c);
            // stringBuilderArray (numRows-2)至1倒序赋值
            } else {
                stringBuilderArray[length - local].append(c);
            }
        }
        StringBuilder result = new StringBuilder();
        for (int index = 0; index < numRows; index++) {
            result.append(stringBuilderArray[index]);
        }

        return result.toString();
    }
}
