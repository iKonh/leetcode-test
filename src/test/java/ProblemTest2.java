import leetcode.Problem12;
import leetcode.Problem13;
import leetcode.Problem14;
import leetcode.Problem15;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

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

    @Test
    public void test15() {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> result = Problem15.threeSum(nums);

        assertEquals(result.size(), 2);
    }

    @Test
    public void test15_2() {
        int[] nums = {0,0,0,0};
        List<List<Integer>> result = Problem15.threeSum(nums);

        assertEquals(result.size(), 1);
    }
}
