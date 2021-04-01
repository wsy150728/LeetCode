package test.q56;


import code.q56.Merge;

import java.util.Arrays;

public class MergeTest {
    public static void main(String[] args) {
        int[][] intervals = {{2,6},{1,3},{8,10},{15,18}};

        Merge model = new Merge();
        int[][] res = model.merge11(intervals);

        for (int[] each : res){
            System.out.println(Arrays.toString(each));
        }

    }
}
