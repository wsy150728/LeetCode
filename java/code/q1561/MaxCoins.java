package code.q1561;

import java.util.Arrays;

/**
 * Tag Sort
 */
public class MaxCoins {
    public static int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int sum = 0;
        int l = piles.length;
        for (int i = l - 2; i >= l / 3; i=i-2){
            sum += piles[i];
        }

        return sum;
    }
}

