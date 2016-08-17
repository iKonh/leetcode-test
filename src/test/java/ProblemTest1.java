import leetcode.*;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

/**
 * Created by Huangyipeng on 2016/08/12.
 */
public class ProblemTest1 {

    @Test
    public void test377() {
        int[] q = {1,2,3};
        int result = Problem377.combinationSum4(q, 4);
        assertEquals(7, result);
    }

    @Test
    public void test1() {
        int[] q = {2,1,9,4,4,56,90,3};
        int[] result = Problem1.twoSum(q, 8);

        Arrays.sort(result);
        assertEquals(result[0], 3);
        assertEquals(result[1], 4);
    }

    @Test
    public void test2() {
        Problem2.ListNode listNode1 = new Problem2.ListNode(2);
        listNode1.next = new Problem2.ListNode(4);
        listNode1.next.next = new Problem2.ListNode(3);

        Problem2.ListNode listNode2 = new Problem2.ListNode(5);
        listNode2.next = new Problem2.ListNode(6);
        listNode2.next.next = new Problem2.ListNode(4);
        Problem2.ListNode result = Problem2.addTwoNumbers(listNode1, listNode2);
        assertEquals(result.val, 7);
        assertEquals(result.next.val, 0);
        assertEquals(result.next.next.val, 8);
    }

    @Test
    public void test3() {
        String s = "abcabcbb";
        int result = Problem3.lengthOfLongestSubstring(s);
        assertEquals(3, result);
    }

    @Test
    public void test6() {
        String s = "PAYPALISHIRING";
        String result = Problem6.convert(s, 3);
        assertEquals(result, "PAHNAPLSIIGYIR");
    }

    @Test
    public void test7() {
        int s = -123;
        int result = Problem7.reverse(s);
        assertEquals(result, -321);
    }
}
