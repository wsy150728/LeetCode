package code.q1356;

import java.util.Arrays;

/**
 * Tag Sort
 * Tag BitManipulation
 */
public class SortByBits {
    public static int[] sortByBits(int[] arr) {
        Arrays.sort(arr);
        int[] oneCountArr = new int[arr.length];
        int[] res = new int[arr.length];
        int maxIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            oneCountArr[i] = Integer.bitCount(arr[i]);
            if(oneCountArr[i] > maxIndex){
                maxIndex = oneCountArr[i];
            }
        }

        int resCount = 0;
        for (int x = 0; x <= maxIndex; x++) {
            for (int y = 0; y < arr.length; y++) {
                if (oneCountArr[y] == x) {
                    res[resCount++] = arr[y];
                    if(resCount == arr.length){
                        return res;
                    }
                }
            }
        }
        return res;
    }

    // 神解法,利用一次排序将1的数量排序和数组原本的排序一次性完成，然后再将数量的位数去掉
    // 精髓是要注意,10的4次方的1的个数会超过10,所以必须要大于10000
    public int[] sortByBits2(int[] arr) {
        int[] map = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            map[i] = Integer.bitCount(arr[i]) * 10001+ arr[i];
        }
        Arrays.sort(map);
        for (int i = 0; i < map.length; i++) {
            map[i] = map[i] % 10001;
        }
        return map;
    }

}
