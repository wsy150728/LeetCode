package test.q33;


import code.q33.Search;
import code.q34.SearchRange;

import java.util.Arrays;

public class SearchTest {
    public static void main(String[] args) {

//        int[] nums = {4,5,6,7,8,1,2,3};
//        int target = 8;
        int[] nums = {1, 3, 5};
        int target = 1;

        Search model = new Search();
        int res = model.search(nums, target);

        System.out.println(res);
    }
}
