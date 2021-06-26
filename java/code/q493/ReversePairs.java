package code.q493;

/**
 * Tag Sort
 * Tag Binary Indexed Tree
 * Tag Segment Tree
 * Tag Binary Search
 * Tag Divide and Conquer
 */
public class ReversePairs {
    public int reversePairs(int[] nums) {
        int res = 0;
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (nums[i] - nums[j] > nums[j]) {
                    res++;
                }
            }
        }
        return res;
    }

}
