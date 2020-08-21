package code.q1403;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Tag Sort
 * Tag Greedy
 */
public class MinSubsequence {
    public static List<Integer> minSubsequence1(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int x = 0;
        Arrays.sort(nums);
        int max = nums.length - 1;
        for (int i = 0; i <= max; i++) {
            int p = sum(nums, max - i, max);
            int q = sum(nums, 0, max - i - 1);
            if (p > q) {
                x = i;
                break;
            }
        }

        for (int i = 0; i <= x; i++) {
            list.add(nums[max--]);
        }

        return list;
    }


    public static List<Integer> minSubsequence2(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int max = nums.length - 1;
        int total = 0;
        for (int s:nums){
            total += s;
        }
        Arrays.sort(nums);
        int temp = 0;
        for (int i = 0; i <= max; i++) {
            list.add(nums[max - i]);
            temp += nums[max - i];
            if (temp > total - temp) {
                break;
            }
        }

        return list;
    }

    private static int sum(int[] nums, int l, int h) {
        int sum = 0;
        while (l <= h) {
            sum += nums[l++];
        }

        return sum;
    }

}
