package test.q283;

import code.q283.MoveZeroes;

import java.util.Arrays;


public class MoveZeroesTest {
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};

        MoveZeroes model = new MoveZeroes();
        model.moveZeroes(nums);

        System.out.println(Arrays.toString(nums));
    }
}
