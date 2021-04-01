package test.sort;

import code.sort.SelectSort;
import code.sort.ShellSort;

import java.util.Arrays;

/**
 * @author wangshengyi
 */
public class ShellSortTest {
    public static void main(String[] args) {
        int[] piles = {9,10,7,6,5,1,2,3,4};

        ShellSort model = new ShellSort();
        int[] output = model.shellSort(piles);

        System.out.println(Arrays.toString(output));
    }
}
