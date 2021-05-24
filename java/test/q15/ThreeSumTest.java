package test.q15;


import code.q15.ThreeSum;
import code.q26.RemoveDuplicates;

import java.util.List;

public class ThreeSumTest {
    public static void main(String[] args) {

//        int[] nums = {4,5,6,7,8,1,2,3};
//        int target = 8;
        int[] nums = {-1,0,1,2,-1,-4,5,6,8};

        ThreeSum model = new ThreeSum();
        List<List<Integer>> res = model.threeSum(nums);

        System.out.println(res);
    }
}
