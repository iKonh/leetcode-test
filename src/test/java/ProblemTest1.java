import leetcode.Problem1;
import leetcode.Problem377;
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
}
