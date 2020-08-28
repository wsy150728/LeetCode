package code.q350;

import java.util.Arrays;

/**
 * Tag Sort
 * Tag Hash Table
 * Tag Two Pointers
 * Tag Binary Search
 */
public class Intersect {

    public static int[] intersect(int[] nums1, int[] nums2) {
        int[] nums = new int[nums1.length];
        int nums1Index = 0;
        int nums2Index = 0;
        int numsIndex = 0;
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        while (nums1Index < nums1.length && nums2Index < nums2.length) {
            if (nums1[nums1Index] == nums2[nums2Index]) {
                nums[numsIndex++] = nums1[nums1Index];
                nums1Index++;
                nums2Index++;
            } else if (nums1[nums1Index] < nums2[nums2Index]) {
                nums1Index++;
            } else {
                nums2Index++;
            }
        }

        return Arrays.copyOf(nums, numsIndex);
    }


}
