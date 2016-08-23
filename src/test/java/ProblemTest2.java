import leetcode.Problem12;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Huangyipeng on 2016/08/23.
 */
public class ProblemTest2 {

    @Test
    public void test8() {
        int a = 123;
        String result = Problem12.intToRoman(a);
        assertEquals(result, "CXXIII");
    }
}
