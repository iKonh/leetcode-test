import leetcode.Problem66;
import leetcode.Problem88;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Huangyipeng on 2016/09/09.
 */
public class ProblemTest9 {
    @Test
    public void test88() {
        int[] nums1 = new int[]{0};
        int[] nums2 = new int[]{1};
        Problem88.merge(nums1, 0, nums2, 1);

        assertEquals(1, nums1[0]);
    }
}
