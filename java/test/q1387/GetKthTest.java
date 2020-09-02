package test.q1387;

import code.q1387.GetKth;

public class GetKthTest {
    public static void main(String[] args) {
//        int lo = 12;
//        int hi = 15;
//        int k = 2;

        int lo = 144;
        int hi = 163;
        int k = 5;

        int output = GetKth.getKth1(lo, hi, k);

        System.out.println(output);
    }
}
