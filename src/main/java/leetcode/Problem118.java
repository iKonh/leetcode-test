package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Given numRows, generate the first numRows of Pascal's triangle.
 */
public class Problem118 {

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> list = new ArrayList<>();
            if (i == 0) {
                list.add(1);
            } else {
                List<Integer> lastList = triangle.get(i - 1);
                for (int j = 0; j <= i; j++) {
                    if (j == 0) {
                        list.add(lastList.get(j));
                    } else if (j == i) {
                        list.add(lastList.get(j - 1));
                    } else {
                        list.add(lastList.get(j) + lastList.get(j - 1));
                    }
                }
            }
            triangle.add(list);
        }
        return triangle;
    }
}
