import leetcode.Problem27;
import leetcode.Problem66;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Huangyipeng on 2016/09/09.
 */
public class ProblemTest7 {
    @Test
    public void test66() {
        int[] nums = {9};
        int[] result = Problem66.plusOne(nums);

        assertEquals(1, result[0]);
        assertEquals(0, result[1]);
    }
}
