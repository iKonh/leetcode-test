import leetcode.Problem12;
import leetcode.Problem13;
import leetcode.Problem14;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Huangyipeng on 2016/08/23.
 */
public class ProblemTest2 {

    @Test
    public void test12() {
        int a = 123;
        String result = Problem12.intToRoman(a);
        assertEquals(result, "CXXIII");
    }

    @Test
    public void test13() {
        String s = "CXXIII";
        int result = Problem13.romanToInt(s);
        assertEquals(result, 123);
    }

    @Test
    public void test14() {
        String[] strs = {"ab", "abc"};
        String result = Problem14.longestCommonPrefix(strs);
        assertEquals(result, "ab");
    }
}
