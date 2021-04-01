package test.tree;

import code.sort.BubbleSort;

import java.util.Arrays;

/**
 * @author wangshengyi
 */
public class PreOrderTraversalTest {
    public static void main(String[] args) {
        int[] piles = {9,8,7,6,5,1,2,3,4};

        BubbleSort model = new BubbleSort();
        int[] output = model.bubbleSort(piles);

        System.out.println(Arrays.toString(output));
    }
}
