package test.sort;

import code.sort.InsertSort;
import code.sort.SelectSort;

import java.util.Arrays;

/**
 * @author wangshengyi
 */
public class InsertSortTest {
    public static void main(String[] args) {
        int[] piles = {9,10,7,6,5,1,2,3,4};

        InsertSort model = new InsertSort();
        int[] output = model.insertSort(piles);

        System.out.println(Arrays.toString(output));
    }
}
