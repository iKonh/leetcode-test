package leetcode;

/**
 * 给定 n 个非负整数表示每个宽度为 1 的柱子的高度图，计算按此排列的柱子，下雨之后能接多少雨水。
 * 输入: [0,1,0,2,1,0,1,3,2,1,2,1]
 * 输出: 6
 **/
public class Chap42 {

    public static int trap(int[] height) {
        int total = 0;
        int start = -1;
        boolean none = false;

        while (!none) {
            none = true;
            for (int i = 0; i < height.length; i++) {
                if (height[i] > 0) {
                    if (start < 0) {
                        start = i;
                    } else {
                        total += (i - start - 1);
                        start = i;
                    }
                    height[i] = height[i] - 1;
                    none = false;
                }
            }
            start = -1;
        }
        return total;
    }

    public static int trap1(int[] height) {

        int maxHeight = 0;

        int maxHeightIndex = 0;
        for (int i = 0; i< height.length; i++) {
            if (height[i] > maxHeight) {
                maxHeight = height[i];
                maxHeightIndex = i;
            }
        }
        if (maxHeight == 0 && maxHeightIndex == 0) {
            return 0;
        }
        maxHeight = 0;

        int water = 0;
        int total = 0;
        for (int i = 0; i<= maxHeightIndex; i++) {
            if (height[i] >= maxHeight) {
                total += water;
                water = 0;
                maxHeight = height[i];
                continue;
            }
            water += maxHeight - height[i];
        }

        maxHeight = 0;
        water = 0;
        for (int i = height.length - 1; i>= maxHeightIndex; i--) {
            if (height[i] >= maxHeight) {
                total += water;
                water = 0;
                maxHeight = height[i];
                continue;
            }
            water += maxHeight - height[i];
        }

        return total;
    }

    public static void main(String[] args) {
        int[] height = {};
        System.out.println(trap1(height));
    }
}
