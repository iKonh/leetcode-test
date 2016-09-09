import leetcode.Problem26;
import leetcode.Problem27;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Huangyipeng on 2016/09/09.
 */
public class ProblemTest3 {

    @Test
    public void test26() {
        int[] nums = {1,1,2};
        int length = Problem26.removeDuplicates(nums);

        assertEquals(2, length);
    }

    @Test
    public void test27() {
        int[] nums = {3,2,2,3};
        int length = Problem27.removeElement(nums, 3);

        assertEquals(2, length);
    }
}
