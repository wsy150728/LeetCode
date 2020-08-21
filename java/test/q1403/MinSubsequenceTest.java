package test.q1403;

import code.q1403.MinSubsequence;

import java.util.List;

public class MinSubsequenceTest {
    public static void main(String[] args) {
//        int[] nums = {4, 3, 10, 9, 8};
//        int[] nums = {4, 4, 7, 6, 7};
        int[] nums = {8, 8};

        List<Integer> res = MinSubsequence.minSubsequence(nums);

        System.out.println(res);
    }
}
