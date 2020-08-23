package test.q1122;

import code.q1122.RelativeSortArray;

import java.util.Arrays;

public class RelativeSortArrayTest {
    public static void main(String[] args) {
//        int[] arr1 = {2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19};
//        int[] arr2 = {2, 1, 4, 3, 9, 6};
        int[] arr1 = {28, 6, 22, 8, 44, 17};
        int[] arr2 = {22, 28, 8, 6};

        int[] nums = RelativeSortArray.relativeSortArray(arr1, arr2);

        System.out.println(Arrays.toString(nums));
    }
}
