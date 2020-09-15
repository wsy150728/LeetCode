package test.q493;

import code.q493.ReversePairs;
import code.q922.SortArrayByParityII;

import java.util.Arrays;

public class ReversePairsTest {
    public static void main(String[] args) {
        int[] s = {1, 3, 2, 3, 1};

        ReversePairs model = new ReversePairs();

        int output = model.reversePairs(s);

        System.out.println(output);
    }
}
