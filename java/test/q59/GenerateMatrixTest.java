package test.q59;


import code.q59.GenerateMatrix;

import java.util.Arrays;

public class GenerateMatrixTest {
    public static void main(String[] args) {
        int target = 7;

        GenerateMatrix model = new GenerateMatrix();
        int[][] res = model.generateMatrix(target);
        for (int[] each: res){
            System.out.println(Arrays.toString(each));
        }

    }
}
