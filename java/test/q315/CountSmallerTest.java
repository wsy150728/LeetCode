package test.q315;

import code.q209.MinSubArrayLen;
import code.q315.CountSmaller;

import java.util.List;

public class CountSmallerTest {
    public static void main(String[] args) {
        int[] nums = {5, 2, 6, 1};
        CountSmaller model = new CountSmaller();
        List<Integer> res = model.countSmaller(nums);
        System.out.println(res);
    }
}
