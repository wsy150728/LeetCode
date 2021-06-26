package test.q53;


import code.q49.GroupAnagrams;
import code.q53.MaxSubArray;

import java.util.List;


public class MaxSubArrayTest {
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};

        MaxSubArray model = new MaxSubArray();
        int res = model.maxSubArray(nums);

        System.out.println(res);
    }
}
