package test.q1356;

import code.q1356.SortByBits;
import code.q922.SortArrayByParityII;

import java.util.Arrays;

public class SortByBitsTest {
    public static void main(String[] args) {
        int[] s = {0, 1, 2, 3, 4, 5, 6, 7, 8};
//        int[] s = {10000, 10000};

        int[] output = SortByBits.sortByBits(s);

        System.out.println(Arrays.toString(output));
    }
}
