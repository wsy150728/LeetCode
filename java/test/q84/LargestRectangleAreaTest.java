package test.q84;


import code.q84.LargestRectangleArea;


public class LargestRectangleAreaTest {
    public static void main(String[] args) {
        int[] nums = {1};

        LargestRectangleArea model = new LargestRectangleArea();
        int res = model.largestRectangleArea(nums);

        System.out.println(res);
    }
}
