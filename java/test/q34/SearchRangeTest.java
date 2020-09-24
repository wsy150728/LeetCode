package test.q34;


import code.q34.SearchRange;

import java.util.Arrays;

public class SearchRangeTest {
    public static void main(String[] args) {
//        int[] nums = {1, 3, 3, 3, 5, 5, 6};
//        int target = 3;

//        int[] nums = {5,7,7,8,8,10};
//        int target = 8;

//        int[] nums = {1};
//        int target = 1;

        int[] nums = {2, 2};
        int target = 3;

        SearchRange model = new SearchRange();
        int[] res = model.searchRange(nums, target);

        System.out.println(Arrays.toString(res));
    }
}
