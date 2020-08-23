package test.q922;

import code.q922.SortArrayByParityII;

import java.util.Arrays;

public class SortArrayByParityIITest {
    public static void main(String[] args) {
        int[] s = {4,2,5,7};

        int[] output = SortArrayByParityII.sortArrayByParityII2(s);

        System.out.println(Arrays.toString(output));
    }
}
