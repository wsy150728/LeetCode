package code.q976;

import java.util.Arrays;

/**
 * Tag Sort
 * Tag Array
 */
public class LargestPerimeter {
    public static int largestPerimeter(int[] A) {
        int sum = 0;
        Arrays.sort(A);
        for (int i = A.length - 1;i > 1; i--){
            if(A[i-2] + A[i-1] > A[i]){
                sum = A[i] + A[i-1] + A[i-2];
                break;
            }
        }

        return sum;
    }



}
