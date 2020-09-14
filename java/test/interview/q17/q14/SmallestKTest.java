package test.interview.q17.q14;

import code.interview.q17.q14.SmallestK;
import code.q973.KClosest;

import java.util.Arrays;

public class SmallestKTest {
    public static void main(String[] args) {
        int[] arrs = {1, 3, 5, 7, 2, 4, 6, 8};
        int k = 4;


        SmallestK model = new SmallestK();

        int[] output = model.smallestK(arrs, k);

        System.out.println(Arrays.toString(output));
    }
}
