package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given an index k, return the kth row of the Pascal's triangle.
 *
 * For example, given k = 3,
 * Return [1,3,3,1].
 */
public class Problem119 {

    public static List<Integer> getRow(int rowIndex) {
        List<Integer> kth = new ArrayList<>();
        for (int i = 0; i <= rowIndex; i++) {
            kth.add(0, 1);
            for (int j = 1; j < kth.size() - 1; j++) {
                kth.set(j, kth.get(j) + kth.get(j + 1));
            }
        }
        return kth;
    }

    public static List<Integer> getRow_better(int rowIndex) {
        Integer[] rowList = new Integer[rowIndex+1];
        rowList[0] = 1;
        for(int i=1; i<rowList.length;i++) {
            rowList[i] = (int)((long)rowList[i-1]*(rowIndex-(i-1))/(i));
        }
        return Arrays.asList(rowList);
    }
}
