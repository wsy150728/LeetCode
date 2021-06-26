package test.q48;


import code.q48.Rotate;

import java.util.Arrays;


public class RotateTest {
    public static void main(String[] args) {
        int[][] nums = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};

        Rotate model = new Rotate();
        int[][] res = model.rotate(nums);

        for (int s = 0;s< res.length;s++){
            System.out.println(Arrays.toString(res[s]));
        }

    }
}
