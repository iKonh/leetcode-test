import leetcode.Problem26;
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
        assertEquals(new int[]{1,2}, nums);
    }
}
