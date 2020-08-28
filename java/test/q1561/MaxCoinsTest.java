package test.q1561;

import code.q1528.ShuffleString;
import code.q1561.MaxCoins;

public class MaxCoinsTest {
    public static void main(String[] args) {
//        int[] piles = {2,4,1,2,7,8};
        int[] piles = {9,8,7,6,5,1,2,3,4};

        int output = MaxCoins.maxCoins(piles);

        System.out.println(output);
    }
}
