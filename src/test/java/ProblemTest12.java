import leetcode.Problem118;
import leetcode.Problem119;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by iKon on 2017/1/8.
 */
public class ProblemTest12 {

    @Test
    public void test118() {
        List<List<Integer>> triangle = Problem118.generate(5);

        System.out.println(triangle);
        assertEquals(5, triangle.size());
    }

    @Test
    public void test119() {
        List<Integer> triangle = Problem119.getRow(4);

        System.out.println(triangle);
        assertEquals(4, triangle.size());
    }
}
