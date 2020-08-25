package test.q1030;

import code.q1030.AllCellsDistOrder;
import code.q1122.RelativeSortArray;

import java.util.Arrays;

public class AllCellsDistOrderTest {
    public static void main(String[] args) {
        int R = 1, C = 2, r0 = 0, c0 = 0;

        int[][] res = AllCellsDistOrder.allCellsDistOrder(R, C, r0, c0);

        for (int[] each:res){
            System.out.println(Arrays.toString(each));
        }
    }
}
