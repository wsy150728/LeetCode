package test.q969;

import code.q969.PancakeSort;

import java.util.List;

public class PancakeSortTest {
    public static void main(String[] args) {
//        int[] s = {3,2,4,1};
        int[] s = {10,5,1,6,3,8,2,4,7,9};
//        int[] s = {1,2,3};


        PancakeSort model = new PancakeSort();

        List<Integer> output = model.pancakeSort(s);

        System.out.println(output);
    }
}
