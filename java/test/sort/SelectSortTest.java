package test.sort;

import code.sort.SelectSort;

import java.util.Arrays;

/**
 * @author wangshengyi
 */
public class SelectSortTest {
    public static void main(String[] args) {
        int[] piles = {9,10,7,6,5,1,2,3,4};

        SelectSort model = new SelectSort();
        int[] output = model.selectSort(piles);

        System.out.println(Arrays.toString(output));
    }
}
