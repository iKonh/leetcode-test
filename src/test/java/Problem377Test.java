import leetcode.Problem377;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Huangyipeng on 2016/08/12.
 */
public class Problem377Test {

    @Test
    public void test377() {
        int[] q = {1,2,3};
        int result = Problem377.combinationSum4(q, 4);
        assertEquals(7, result);
    }
}
