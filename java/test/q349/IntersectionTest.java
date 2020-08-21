package test.q349;

import code.q349.Intersection;

import java.util.Arrays;

public class IntersectionTest {
    public static void main(String[] args) {
        int[] nums2 = {8,0,3};
        int[] nums1 = {0,0};

        int[] nums = Intersection.intersection3(nums1, nums2);

        System.out.println(Arrays.toString(nums));
    }
}
