package test.q46;


import code.q46.Permute;

import java.util.List;

public class PrmuteTest {
    public static void main(String[] args) {
        int[] nums = {2, 3, 5};

        Permute model = new Permute();
        List<List<Integer>> res = model.permute(nums);

        for (int s = 0;s< res.size();s++){
            System.out.println(res.get(s).toString());
        }

    }
}
