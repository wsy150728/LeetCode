package test.q704;

import code.q704.Search;

public class SearchTest {
    public static void main(String[] args) {
//        int[] s = {-1,0,3,5,9,12};
//        int target = 2;

        int[] s = {5};
        int target = 5;

        Search model = new Search();

        int res = model.search(s, target);

        System.out.println(res);
    }
}
