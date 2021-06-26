package test.q209;

import code.q209.MinSubArrayLen;

public class MinSubArrayLenTest {
    public static void main(String[] args) {
        int target = 7;
        int[] nums = {2,3,1,2,4,3};
        MinSubArrayLen model = new MinSubArrayLen();
        Integer res = model.minSubArrayLen(target, nums);
        System.out.println(res);
    }
}
