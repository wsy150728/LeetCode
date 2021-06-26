package code.q84;

import java.awt.*;

/**
 * @author wangshengyi
 */
public class LargestRectangleArea {
    public int largestRectangleArea(int[] heights) {
        int max = 0;
        for (int i = 0; i <= heights.length - 1; i++) {
            int minHeight = heights[i];
            for (int j = i; j < heights.length; j++) {
                minHeight = Math.min(minHeight, heights[j]);
                max = Math.max(max, minHeight * (j - i + 1));
            }
        }
        return max;
    }

}
