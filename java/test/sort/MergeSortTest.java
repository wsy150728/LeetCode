package test.sort;

import code.sort.BubbleSort;
import code.sort.MergeSort;

import java.util.Arrays;

/**
 * @author wangshengyi
 */
public class MergeSortTest {
    public static void main(String[] args) {
        int[] piles = {9,8,7,6,5,1,2,3,4};

        MergeSort model = new MergeSort();
        int[] output = model.mergeSort(piles);

        System.out.println(Arrays.toString(output));
    }
}
