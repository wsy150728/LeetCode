package test.q1329;

import code.q1329.DiagonalSort;

import java.util.Arrays;

public class DiagonalSortTest {
    public static void main(String[] args) {
        int[][] s = {{3, 3, 1, 1}, {2, 2, 1, 2}, {1, 1, 1, 2}};

//        int[][] s = {{37, 98, 82, 45, 42}};
//        int[][] s = {{75, 21, 13, 24, 8}, {24, 100, 40, 49, 62}};
        int[][] output = DiagonalSort.diagonalSort(s);

        for (int i = 0; i < output.length; i++) {
            System.out.println(Arrays.toString(output[i]));
        }
    }
}
