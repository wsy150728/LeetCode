package test.q77;


import code.q77.Combine;

import java.util.List;

public class CombineTest {
    public static void main(String[] args) {
        int n = 4;
        int k = 2;

        Combine model = new Combine();
        List<List<Integer>> res = model.combine(n, k);

        System.out.println(res);
    }
}
