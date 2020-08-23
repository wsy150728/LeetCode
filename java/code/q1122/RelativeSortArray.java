package code.q1122;

import java.util.*;

/**
 * Tag Sort
 * Tag Array
 */
public class RelativeSortArray {
    public static int[] relativeSortArray(int[] arr1, int[] arr2) {
        List<Integer> list = new ArrayList<>();
        for (int arr1V : arr1) {
            boolean flag = true;
            for (int arr2V : arr2) {
                if (arr1V == arr2V) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                list.add(arr1V);
            }
        }
        Collections.sort(list);

        int[] res = new int[arr1.length];
        int resIndex = 0;
        for (int arr2V : arr2) {
            for (int arr1V : arr1) {
                if (arr1V == arr2V) {
                    res[resIndex++] = arr1V;
                }
            }
        }

        for (int a : list) {
            res[resIndex++] = a;
        }

        return res;
    }

//    public static int[] relativeSortArray2(int[] arr1, int[] arr2) {
//        Arrays.sort(arr1);
//
//        int[] res = new int[arr1.length];
//        int restIndex = arr2.length;
//
//        for (int i = 0; i< arrarr2V : arr2) {
//            boolean flag = true;
//
//            for (int arr1V : arr1) {
//                if (arr1V == arr2V) {
//                    res[restIndex++] = arr1V;
//                    break;
//                }
//            }
//        }
//
//
//        return res;
//    }


}
