package test.q39;


import code.q39.CombinationSum;

import java.util.List;

public class CombinationSumTest {
    public static void main(String[] args) {
        int[] nums = {2, 3, 5, 6};
        int target = 7;

        CombinationSum model = new CombinationSum();
        List<List<Integer>> res = model.combinationSum(nums, target);

        for (int s = 0;s< res.size();s++){
            System.out.println(res.get(s).toString());
        }

    }
}
