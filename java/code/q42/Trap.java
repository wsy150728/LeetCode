package code.q42;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author wangshengyi
 * 给定 n 个非负整数表示每个宽度为 1 的柱子的高度图，计算按此排列的柱子，下雨之后能接多少雨水。
 */
public class Trap {
    // 动态规划
//    public int trap(int[] height) {
//        int len = height.length;
//        if (len < 3) {
//            return 0;
//        }
//
//        // 从左往右遍历获取右边的最高
//        int[] left = new int[len];
//        left[0] = height[0];
//        for (int i = 1; i < len; i++) {
//            left[i] = Math.max(left[i - 1], height[i]);
//        }
//
//        // 从右往左遍历获取左边的最高
//        int[] right = new int[len];
//        right[len - 1] = height[len - 1];
//        for (int i = len - 2; i >= 0; i--) {
//            right[i] = Math.max(right[i + 1], height[i]);
//        }
//        // 循环数组获取每个位置可以储存的水量
//        int res = 0;
//        for (int i = 0; i < len; i++) {
//            res += Math.min(left[i], right[i]) - height[i];
//        }
//
//        return res;
//    }

    /**
     * 栈方法
     */
//    public int trap(int[] height) {
//        int ans = 0;
//        Deque<Integer> stack = new LinkedList<>();
//        int n = height.length;
//        for (int i = 0; i < n; ++i) {
//            while (!stack.isEmpty() && height[i] > height[stack.peek()]) {
//                int top = stack.pop();
//                if (stack.isEmpty()) {
//                    break;
//                }
//                int left = stack.peek();
//                int currWidth = i - left - 1;
//                int currHeight = Math.min(height[left], height[i]) - height[top];
//                ans += currWidth * currHeight;
//            }
//            stack.push(i);
//        }
//        return ans;
//    }


    // 双指针
    public int trap(int[] height) {
        int ans = 0;
        int left = 0;
        int right = height.length - 1;
        int leftMax = 0;
        int rightMax = 0;
        // 左右未重合
        while (left < right) {
            leftMax = Math.max(leftMax, height[left]);
            rightMax = Math.max(rightMax, height[right]);
            // 左边比右边墙矮
            if (height[left] < height[right]) {
                // 左边墙 - 当前高度 = 水的容量
                ans += leftMax - height[left];
                ++left;
            } else {
                ans += rightMax - height[right];
                --right;
            }
        }
        return ans;
    }
}
