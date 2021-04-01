package test.sort;

import code.sort.MergeSort;
import code.sort.QuickSort;

import java.util.Arrays;

/**
 * @author wangshengyi
 */
public class QuickSortTest {
    public static void main(String[] args) {
        int[] piles = {9,8,7,6,5,1,2,3,4};

        QuickSort model = new QuickSort();
        int[] output = model.quickSort(piles);

        System.out.println(Arrays.toString(output));
    }
}
