package test.q1508;

import code.q1508.RangeSum;

public class RangeSumTest {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int n = 4;
        int left =1;
        int right = 5;
        RangeSum model = new RangeSum();
        int res = model.rangeSum(nums, n, left, right);

        System.out.println(res);
    }
}
