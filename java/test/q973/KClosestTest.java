package test.q973;

import code.q973.KClosest;

import java.util.Arrays;

public class KClosestTest {
    public static void main(String[] args) {
//        int[][] points = {{1,3},{-2,2}};
//        int k = 1;
        int[][] points = {{3, 3}, {5, -1}, {-2, 4}};
//        int[][] points = {{0,1},{1,0}};
        int k = 2;


        KClosest model = new KClosest();

        int[][] output = model.kClosest(points, k);

        for (int[] s : output) {
            System.out.println(Arrays.toString(s));
        }
    }
}
