package code.q976;

import java.util.Arrays;

/**
 * Tag Sort
 * Tag Array
 */
public class LargestPerimeter {
    public static int largestPerimeter(int[] A) {
        Arrays.sort(A);
        for (int i = A.length - 1;i > 1; i--){
            if(A[i-2] + A[i-1] > A[i]){
                return A[i] + A[i-1] + A[i-2];
            }
        }

        return 0;
    }



}
