package test.q78;


import code.q77.Combine;
import code.q78.Subsets;

import java.util.List;

public class SubsetsTest {
    public static void main(String[] args) {
        int[] nums = {1,2,3};

        Subsets model = new Subsets();
        List<List<Integer>> res = model.subsets(nums);

        System.out.println(res);
    }
}
