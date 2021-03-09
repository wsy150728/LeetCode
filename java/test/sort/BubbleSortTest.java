package test.sort;

import code.sort.BubbleSort;

import java.util.Arrays;

/**
 * @author wangshengyi
 */
public class BubbleSortTest {
    public static void main(String[] args) {
        int[] piles = {9,8,7,6,5,1,2,3,4};

        BubbleSort model = new BubbleSort();
        int[] output = model.bubbleSortAsc(piles);

        System.out.println(Arrays.toString(output));
    }
}
