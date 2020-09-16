package test.q496;

import code.q496.NextGreaterElement;

import java.util.Arrays;

public class NextGreaterElementTest {
    public static void main(String[] args) {
        int[] nums1 = {4, 1, 2};
        int[] nums2 = {1, 3, 4, 2};

        NextGreaterElement model = new NextGreaterElement();

        int[] res = model.nextGreaterElement2(nums1, nums2);

        System.out.println(Arrays.toString(res));
    }
}
