package code.q1502;

import java.util.Arrays;

/**
 * Tag Sort
 * Tag Array
 */
public class CanMakeArithmeticProgression {
    public static boolean canMakeArithmeticProgression(int[] arr) {
        if(arr.length <= 2){
            return true;
        }

        Arrays.sort(arr);

        int diff = arr[1] - arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(diff != arr[i] - arr[i-1]){
                return false;
            }
        }

        return true;
    }

}
