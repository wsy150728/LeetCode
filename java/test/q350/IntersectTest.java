package test.q350;

import code.q350.Intersect;

import java.util.Arrays;

public class IntersectTest {
    public static void main(String[] args) {
        int[] nums1 = {4, 9, 5};
        int[] nums2 = {9, 4, 9, 8, 4};

        int[] nums = Intersect.intersect(nums1, nums2);

        System.out.println(Arrays.toString(nums));
    }
}
